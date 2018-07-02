package org.miliconvert.adatp3.tools;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.miliconvert.adatp3.tools.impl.Openable;
import org.miliconvert.adatp3.tools.impl.bl13.FieldBL13Extractor;

public class ExtractFieldApp implements IApplication {
	private Log logger = LogFactory.getLog(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public Object start(IApplicationContext context) throws Exception {
		Map arguments = context.getArguments();
		String[] args = (String[]) arguments.get("application.args");


		CommandLineParser parser = new PosixParser();

		Options options = new Options();
		options.addOption( "f", "file", true, "The HTML file or dir to convert" );
		options.addOption( "n", "table", true, "The number of the table to extract" );
		options.addOption( "o", "output", true, "The output dir");		
		options.addOption( "h", "help", false, "Print this message");

		
		
		try {

		    CommandLine cmd = parser.parse( options, args );
		    HelpFormatter formatter = new HelpFormatter();
		    if(cmd.hasOption( "h" )){
		    	formatter.printHelp("extractfieldapp", options );
		    	return IApplication.EXIT_OK;
		    }

		    if( ! cmd.hasOption( "f" ) || !cmd.hasOption("n")) {
				formatter.printHelp("extractfieldapp", options, true );
				return IApplication.EXIT_OK;
		    }
		    
		    
		    String givenFileName = cmd.getOptionValue("f");
			int tableToExtract = Integer.parseInt(cmd.getOptionValue("n"));
			String outputDir = null;
			if (cmd.hasOption("o")) {
				outputDir = cmd.getOptionValue("o");
			}
			
			File html = new File(givenFileName);

			if (html.isDirectory()) {
				File[] csvs = html.listFiles(new FilenameFilter() {

					@Override
					public boolean accept(File dir, String name) {
						return name.toLowerCase().endsWith(".htm")
							|| name.toLowerCase().endsWith(".html");
					}
				});
				for (File csv : csvs) {
					extractCSVFromTable(csv.getAbsolutePath(), tableToExtract,
							outputDir);
				}
			} else {
				extractCSVFromTable(givenFileName, tableToExtract, outputDir);
			}

		    
		    
		}
		catch( ParseException exp ) {
			logger.error( "Unexpected exception:" + exp.getMessage() );
		}

		
		return EXIT_OK;
	}

	private void extractCSVFromTable(String givenFileName, int tableToExtract,
			String outputDir) {
		IHTMLExtractor extractor = new FieldBL13Extractor(new Openable(givenFileName));
		
		
		try {
			extractor.extract(tableToExtract, outputDir);
		} catch (Throwable t) {
			logger.error(t.getMessage(), t);
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
