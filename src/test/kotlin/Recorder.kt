import io.gatling.recorder.GatlingRecorder
import io.gatling.recorder.config.RecorderPropertiesBuilder
import scala.Option

object Recorder {

  @JvmStatic
  fun main(args: Array<String>) {
    val props = RecorderPropertiesBuilder()
            .simulationsFolder(IDEPathHelper.mavenSourcesDirectory.toString())
            .resourcesFolder(IDEPathHelper.mavenResourcesDirectory.toString())
            .simulationPackage("computerdatabase")
            .simulationFormatKotlin()

    GatlingRecorder.fromMap(props.build(), Option.apply(IDEPathHelper.recorderConfigFile))
  }
}
