/**
 * Precompiled [wwwkr.android.library.gradle.kts][Wwwkr_android_library_gradle] script plugin.
 *
 * @see Wwwkr_android_library_gradle
 */
public
class Wwwkr_android_libraryPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Wwwkr_android_library_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
