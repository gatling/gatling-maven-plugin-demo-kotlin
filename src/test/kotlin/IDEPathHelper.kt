import java.nio.file.Path
import java.nio.file.Paths

object IDEPathHelper {
  private val projectRootDir = Paths.get(javaClass.getResource("gatling.conf").toURI()).parent.parent.parent
  private val mavenTargetDirectory: Path = projectRootDir.resolve("target")
  private val mavenSrcTestDirectory: Path = projectRootDir.resolve("src").resolve("test")

  val mavenSourcesDirectory: Path = mavenSrcTestDirectory.resolve("kotlin")
  val mavenResourcesDirectory: Path = mavenSrcTestDirectory.resolve("resources")
  val mavenBinariesDirectory: Path = mavenTargetDirectory.resolve("test-classes")
  val resultsDirectory: Path = mavenTargetDirectory.resolve("gatling")
  val recorderConfigFile: Path = mavenResourcesDirectory.resolve("recorder.conf")
}
