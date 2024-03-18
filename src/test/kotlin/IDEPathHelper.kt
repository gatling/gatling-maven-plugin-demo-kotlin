import java.nio.file.Path
import java.nio.file.Paths

object IDEPathHelper {
  val mavenBinariesDirectory: Path =
          System.getProperty("java.class.path").split(File.pathSeparator)
                  .map { cpe ->  Path.of(cpe) }
                  .filter { cpe -> cpe.endsWith("test-classes") }
                  .findFirst()
                  .get()

  private val mavenTargetDirectory: Path = mavenBinariesDirectory.parent
  private val projectRootDir = mavenTargetDirectory.parent
  private val mavenSrcTestDirectory: Path = projectRootDir.resolve("src").resolve("test")

  val mavenSourcesDirectory: Path = mavenSrcTestDirectory.resolve("kotlin")
  val mavenResourcesDirectory: Path = mavenSrcTestDirectory.resolve("resources")
  val resultsDirectory: Path = mavenTargetDirectory.resolve("gatling")
  val recorderConfigFile: Path = mavenResourcesDirectory.resolve("recorder.conf")
}
