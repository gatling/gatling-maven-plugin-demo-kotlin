import io.gatling.recorder.GatlingRecorder
import io.gatling.recorder.config.RecorderPropertiesBuilder
import scala.Option
import java.nio.file.Path

object Recorder {

  @JvmStatic
  fun main(args: Array<String>) {
    val props = RecorderPropertiesBuilder()
            .simulationsFolder(IDEPathHelper.mavenSourcesDirectory.toString())
            .resourcesFolder(IDEPathHelper.mavenResourcesDirectory.toString())
            .simulationPackage("computerdatabase")

    GatlingRecorder.fromMap(props.build(), Option.apply<Path>(IDEPathHelper.recorderConfigFile))
  }
}
