/**
 * Precompiled [wwwkr.verify.detekt.gradle.kts][Wwwkr_verify_detekt_gradle] script plugin.
 *
 * @see Wwwkr_verify_detekt_gradle
 */
public
class Wwwkr_verify_detektPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Wwwkr_verify_detekt_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
