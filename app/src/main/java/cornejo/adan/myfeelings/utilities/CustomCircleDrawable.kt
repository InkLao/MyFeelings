package cornejo.adan.myfeelings.utilities

import android.graphics.RectF
import android.graphics.drawable.Drawable
import android.content.Context
import android.graphics.Canvas
import android.graphics.ColorFilter

class CustomCircleDrawable: Drawable {
    var coordenadas: RectF? = null
    var anguloBarrido: Float = 0.0F
    var anguloInicio: Float = 0.0F
    var grosorMetrica: Int = 0
    var grosorFondo: Int = 0
    var context: Context? = null
    var emociones = ArrayList<Emociones>()

    constructor(context: Context, emociones: ArrayList<Emociones>) {

        this.context = context
        grosorMetrica = 10dp
                grosorFondo = 15dp
                this.emociones = emociones
    }


    override fun draw(canvas: Canvas) {
        TODO("Not yet implemented")
    }

    override fun getOpacity(): Int {
        TODO("Not yet implemented")
    }

    override fun setAlpha(alpha: Int) {
        TODO("Not yet implemented")
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        TODO("Not yet implemented")
    }

}