package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iq1  reason: default package */
/* loaded from: classes.dex */
public final class iq1 extends qm4 {
    public int j0 = -1;
    public int k0 = -1;
    public final u63 l0;
    public final u63 m0;

    public iq1(u63 u63Var, u63 u63Var2) {
        this.l0 = u63Var;
        this.m0 = u63Var2;
    }

    @Override // defpackage.qm4
    public final jy j(yq1 yq1Var) {
        Map map = Collections.EMPTY_MAP;
        jy j = super.j(yq1Var);
        this.j0 = bp2.h();
        this.k0 = bp2.h();
        return j;
    }

    public final void v(long j, Surface surface, wv6 wv6Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        bp2.d((AtomicBoolean) this.L, true);
        bp2.c((Thread) this.X);
        HashMap hashMap = (HashMap) this.R;
        np2.A("The surface is not registered.", hashMap.containsKey(surface));
        sy syVar = (sy) hashMap.get(surface);
        Objects.requireNonNull(syVar);
        if (syVar == bp2.j) {
            syVar = d(surface);
            if (syVar != null) {
                hashMap.put(surface, syVar);
            } else {
                return;
            }
        }
        sy syVar2 = syVar;
        EGLSurface eGLSurface = syVar2.a;
        if (surface != ((Surface) this.f0)) {
            l(eGLSurface);
            this.f0 = surface;
        }
        GLES20.glClearColor(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 1.0f);
        GLES20.glClear(16384);
        w(syVar2, wv6Var, surfaceTexture, this.l0, this.j0, true);
        w(syVar2, wv6Var, surfaceTexture2, this.m0, this.k0, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.Y, eGLSurface, j);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.Y, eGLSurface)) {
            kj2.f0("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            s(surface, false);
        }
    }

    public final void w(sy syVar, wv6 wv6Var, SurfaceTexture surfaceTexture, u63 u63Var, int i, boolean z) {
        float[] fArr;
        u(i);
        int i2 = syVar.b;
        int i3 = syVar.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr2 = new float[16];
        surfaceTexture.getTransformMatrix(fArr2);
        float[] fArr3 = new float[16];
        if (z) {
            fArr = wv6Var.X;
        } else {
            fArr = wv6Var.Y;
        }
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        zo2 zo2Var = (zo2) this.h0;
        zo2Var.getClass();
        if (zo2Var instanceof ap2) {
            GLES20.glUniformMatrix4fv(((ap2) zo2Var).f, 1, false, fArr3, 0);
            bp2.b("glUniformMatrix4fv");
        }
        wr4 wr4Var = (wr4) u63Var.L;
        Object obj = wr4Var.a;
        Object obj2 = wr4Var.b;
        Size size = new Size((int) (((Float) wr4Var.a).floatValue() * i2), (int) (((Float) obj2).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        float[] fArr6 = new float[16];
        Matrix.setIdentityM(fArr6, 0);
        Matrix.scaleM(fArr4, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        wr4 wr4Var2 = (wr4) u63Var.B;
        if (((Float) obj).floatValue() != RecyclerView.B1 || ((Float) obj2).floatValue() != RecyclerView.B1) {
            Matrix.translateM(fArr5, 0, ((Float) wr4Var2.a).floatValue() / ((Float) obj).floatValue(), ((Float) wr4Var2.b).floatValue() / ((Float) obj2).floatValue(), RecyclerView.B1);
        }
        Matrix.multiplyMM(fArr6, 0, fArr4, 0, fArr5, 0);
        GLES20.glUniformMatrix4fv(zo2Var.b, 1, false, fArr6, 0);
        bp2.b("glUniformMatrix4fv");
        GLES20.glUniform1f(zo2Var.c, 1.0f);
        bp2.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        bp2.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
