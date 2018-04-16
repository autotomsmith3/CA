import java.io.InputStream;
import java.util.Properties;
public class readPropertiesFile {
	protected Properties prop = null;
	protected InputStream input = readPropertiesFile.class.getClassLoader()
			.getResourceAsStream("data/config.properties");
	public readPropertiesFile() throws Exception {
		prop = new Properties();
		prop.load(input);
	}
	public String getFirstEnv() {
		return prop.getProperty("firstEnv");
	}
	public String getSecondEnv() {
		return prop.getProperty("secondEnv");
	}
	public String getDWfilePaht() {
		return prop.getProperty("DW_filePath");
	}
	public String getDCfilePaht() {
		return prop.getProperty("DC_filePath");
	}
	public String getdataDir() {
		return prop.getProperty("dataDir");
	}
}
