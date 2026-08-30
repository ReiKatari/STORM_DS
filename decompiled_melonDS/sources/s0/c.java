package s0;

import aj.g;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import d0.a0;
import d0.z;
import d1.e2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import r0.m;
import t0.h;
import t0.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends e2 {

    /* renamed from: h0  reason: collision with root package name */
    public int f12787h0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public int f12788i0 = -1;

    /* renamed from: j0  reason: collision with root package name */
    public final z f12789j0;

    /* renamed from: k0  reason: collision with root package name */
    public final z f12790k0;

    public c(z zVar, z zVar2) {
        this.f12789j0 = zVar;
        this.f12790k0 = zVar2;
    }

    @Override // d1.e2
    public final t0.a i(a0 a0Var) {
        Map map = Collections.EMPTY_MAP;
        t0.a i2 = super.i(a0Var);
        this.f12787h0 = i.h();
        this.f12788i0 = i.h();
        return i2;
    }

    public final void q(long j2, Surface surface, m mVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        i.d((AtomicBoolean) this.L, true);
        i.c((Thread) this.X);
        HashMap hashMap = (HashMap) this.R;
        p7.m.o("The surface is not registered.", hashMap.containsKey(surface));
        t0.c cVar = (t0.c) hashMap.get(surface);
        Objects.requireNonNull(cVar);
        if (cVar == i.f13072j) {
            cVar = d(surface);
            if (cVar != null) {
                hashMap.put(surface, cVar);
            } else {
                return;
            }
        }
        t0.c cVar2 = cVar;
        EGLSurface eGLSurface = cVar2.f13052a;
        if (surface != ((Surface) this.f3562d0)) {
            k(eGLSurface);
            this.f3562d0 = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        r(cVar2, mVar, surfaceTexture, this.f12789j0, this.f12787h0, true);
        r(cVar2, mVar, surfaceTexture2, this.f12790k0, this.f12788i0, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.Y, eGLSurface, j2);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.Y, eGLSurface)) {
            g.y0("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            n(surface, false);
        }
    }

    public final void r(t0.c cVar, m mVar, SurfaceTexture surfaceTexture, z zVar, int i2, boolean z10) {
        float[] fArr;
        p(i2);
        int i10 = cVar.f13053b;
        int i11 = cVar.f13054c;
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glScissor(0, 0, i10, i11);
        float[] fArr2 = new float[16];
        surfaceTexture.getTransformMatrix(fArr2);
        float[] fArr3 = new float[16];
        if (z10) {
            fArr = mVar.X;
        } else {
            fArr = mVar.Y;
        }
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        t0.g gVar = (t0.g) this.f3564f0;
        gVar.getClass();
        if (gVar instanceof h) {
            GLES20.glUniformMatrix4fv(((h) gVar).f13061f, 1, false, fArr3, 0);
            i.b("glUniformMatrix4fv");
        }
        z5.b bVar = (z5.b) zVar.L;
        Object obj = bVar.f14961a;
        Object obj2 = bVar.f14962b;
        Size size = new Size((int) (((Float) bVar.f14961a).floatValue() * i10), (int) (((Float) obj2).floatValue() * i11));
        Size size2 = new Size(i10, i11);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        float[] fArr6 = new float[16];
        Matrix.setIdentityM(fArr6, 0);
        Matrix.scaleM(fArr4, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        z5.b bVar2 = (z5.b) zVar.B;
        if (((Float) obj).floatValue() != 0.0f || ((Float) obj2).floatValue() != 0.0f) {
            Matrix.translateM(fArr5, 0, ((Float) bVar2.f14961a).floatValue() / ((Float) obj).floatValue(), ((Float) bVar2.f14962b).floatValue() / ((Float) obj2).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr6, 0, fArr4, 0, fArr5, 0);
        GLES20.glUniformMatrix4fv(gVar.f13057b, 1, false, fArr6, 0);
        i.b("glUniformMatrix4fv");
        GLES20.glUniform1f(gVar.f13058c, 1.0f);
        i.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        i.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
