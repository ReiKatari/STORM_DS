package androidx.preference;

import android.content.DialogInterface;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.render.GlContext;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1595a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i2, Looper looper, Object obj) {
        super(looper);
        this.f1595a = i2;
        this.f1596b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f1595a) {
            case 0:
                if (message.what == 1) {
                    ((a0) this.f1596b).bindPreferences();
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                message.getClass();
                int i2 = message.what;
                if (i2 != 1) {
                    int i10 = 0;
                    if (i2 != 2) {
                        if (i2 == 3) {
                            x0 x0Var = ((ih.g) this.f1596b).X;
                            ArrayList arrayList = (ArrayList) x0Var.f14093f;
                            ArrayList arrayList2 = (ArrayList) x0Var.f14094g;
                            GlContext glContext = (GlContext) x0Var.f14089b;
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                ((EmulatorSurfaceView) obj).b(glContext);
                            }
                            int size2 = arrayList2.size();
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                ((EmulatorSurfaceView) obj2).b(glContext);
                            }
                            ((ArrayList) x0Var.f14093f).clear();
                            arrayList2.clear();
                            EGLDisplay eGLDisplay = glContext.f9517a;
                            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                            glContext.a();
                            return;
                        }
                        return;
                    }
                    x0 x0Var2 = ((ih.g) this.f1596b).X;
                    synchronized (x0Var2.f14092e) {
                        try {
                            ArrayList arrayList3 = (ArrayList) x0Var2.f14094g;
                            int size3 = arrayList3.size();
                            while (i10 < size3) {
                                Object obj3 = arrayList3.get(i10);
                                i10++;
                                ((EmulatorSurfaceView) obj3).b((GlContext) x0Var2.f14089b);
                            }
                            ((ArrayList) x0Var2.f14094g).clear();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                ih.g gVar = (ih.g) this.f1596b;
                long j2 = message.getData().getLong("frame-deadline");
                if (gVar.B) {
                    synchronized (gVar.X.f14092e) {
                        long j10 = 0;
                        if (j2 > 0) {
                            try {
                                j10 = j2 - (((float) gVar.L.A) * 2.0f);
                            } finally {
                            }
                        }
                        MelonEmulator.f9466a.presentFrame(j10, gVar.R);
                    }
                    return;
                }
                return;
            default:
                int i12 = message.what;
                if (i12 != -3 && i12 != -2 && i12 != -1) {
                    if (i12 == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f1596b).get(), message.what);
                return;
        }
    }

    public /* synthetic */ v() {
        this.f1595a = 2;
    }
}
