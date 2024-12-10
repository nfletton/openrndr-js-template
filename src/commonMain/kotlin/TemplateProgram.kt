import kotlinx.browser.document
import org.openrndr.application
import org.openrndr.color.ColorRGBa

val p = document.getElementById("openrndr-canvas")!!.getAttribute("data-program")!!

fun p1() = application {
    program {
        extend {
            drawer.clear(ColorRGBa.PINK)
        }
    }
}

fun p2() = application {
    program {
        extend {
            drawer.clear(ColorRGBa.YELLOW)
        }
    }
}

val apps = mapOf(
    "p1" to ::p1,
    "p2" to ::p2,
)

fun main() = apps[p]!!.invoke()
