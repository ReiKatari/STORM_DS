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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bm1  reason: default package */
/* loaded from: classes.dex */
public final class bm1 extends pd4 {
    public int i0 = -1;
    public int j0 = -1;
    public final q03 k0;
    public final q03 l0;

    public bm1(q03 q03Var, q03 q03Var2) {
        this.k0 = q03Var;
        this.l0 = q03Var2;
    }

    @Override // defpackage.pd4
    public final bx i(sm1 sm1Var) {
        Map map = Collections.EMPTY_MAP;
        bx i = super.i(sm1Var);
        this.i0 = xj2.h();
        this.j0 = xj2.h();
        return i;
    }

    public final void v(long j, Surface surface, ck6 ck6Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        xj2.d((AtomicBoolean) this.L, true);
        xj2.c((Thread) this.X);
        HashMap hashMap = (HashMap) this.R;
        nl2.D("The surface is not registered.", hashMap.containsKey(surface));
        gx gxVar = (gx) hashMap.get(surface);
        Objects.requireNonNull(gxVar);
        if (gxVar == xj2.j) {
            gxVar = d(surface);
            if (gxVar != null) {
                hashMap.put(surface, gxVar);
            } else {
                return;
            }
        }
        gx gxVar2 = gxVar;
        EGLSurface eGLSurface = gxVar2.a;
        if (surface != ((Surface) this.e0)) {
            m(eGLSurface);
            this.e0 = surface;
        }
        GLES20.glClearColor(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 1.0f);
        GLES20.glClear(16384);
        w(gxVar2, ck6Var, surfaceTexture, this.k0, this.i0, true);
        w(gxVar2, ck6Var, surfaceTexture2, this.l0, this.j0, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.Y, eGLSurface, j);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.Y, eGLSurface)) {
            ve2.c0("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            s(surface, false);
        }
    }

    public final void w(gx gxVar, ck6 ck6Var, SurfaceTexture surfaceTexture, q03 q03Var, int i, boolean z) {
        float[] fArr;
        u(i);
        int i2 = gxVar.b;
        int i3 = gxVar.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr2 = new float[16];
        surfaceTexture.getTransformMatrix(fArr2);
        float[] fArr3 = new float[16];
        if (z) {
            fArr = ck6Var.X;
        } else {
            fArr = ck6Var.Y;
        }
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        vj2 vj2Var = (vj2) this.g0;
        vj2Var.getClass();
        if (vj2Var instanceof wj2) {
            GLES20.glUniformMatrix4fv(((wj2) vj2Var).f, 1, false, fArr3, 0);
            xj2.b("glUniformMatrix4fv");
        }
        ui4 ui4Var = (ui4) q03Var.L;
        Object obj = ui4Var.a;
        Object obj2 = ui4Var.b;
        Size size = new Size((int) (((Float) ui4Var.a).floatValue() * i2), (int) (((Float) obj2).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        float[] fArr6 = new float[16];
        Matrix.setIdentityM(fArr6, 0);
        Matrix.scaleM(fArr4, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        ui4 ui4Var2 = (ui4) q03Var.B;
        if (((Float) obj).floatValue() != RecyclerView.A1 || ((Float) obj2).floatValue() != RecyclerView.A1) {
            Matrix.translateM(fArr5, 0, ((Float) ui4Var2.a).floatValue() / ((Float) obj).floatValue(), ((Float) ui4Var2.b).floatValue() / ((Float) obj2).floatValue(), RecyclerView.A1);
        }
        Matrix.multiplyMM(fArr6, 0, fArr4, 0, fArr5, 0);
        GLES20.glUniformMatrix4fv(vj2Var.b, 1, false, fArr6, 0);
        xj2.b("glUniformMatrix4fv");
        GLES20.glUniform1f(vj2Var.c, 1.0f);
        xj2.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        xj2.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
