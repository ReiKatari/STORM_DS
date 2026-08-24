package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import android.widget.Toast;
import com.stormds.emulator.R;
import me.magnum.melonds.translator.ui.GameTranslationOverlayView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq2  reason: default package */
/* loaded from: classes.dex */
public final class gq2 extends hw6 implements eo2 {
    public boolean X;
    public int Y;
    public final /* synthetic */ hq2 Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ boolean e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq2(hq2 hq2Var, boolean z, boolean z2, r41 r41Var) {
        super(2, r41Var);
        this.Z = hq2Var;
        this.d0 = z;
        this.e0 = z2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((gq2) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new gq2(this.Z, this.d0, this.e0, r41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        if (r14 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
        if (r14 == r1) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        boolean z;
        GameTranslationOverlayView gameTranslationOverlayView;
        GameTranslationOverlayView gameTranslationOverlayView2;
        boolean z2;
        boolean z3;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        hq2 hq2Var = this.Z;
        try {
            try {
            } catch (Throwable unused) {
                bitmap = null;
                z = i;
            }
        } catch (Throwable th) {
            Log.e("GameTranslatorManager", "MediaProjection capture failed", th);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        boolean z4 = this.X;
                        oi2.Y(obj);
                        i = z4;
                        bitmap2 = (Bitmap) obj;
                        bitmap = bitmap2;
                        z = i;
                        gameTranslationOverlayView = hq2Var.l;
                        if (gameTranslationOverlayView != null) {
                            gameTranslationOverlayView.setShowFloatingButton(this.d0);
                        }
                        gameTranslationOverlayView2 = hq2Var.l;
                        if (gameTranslationOverlayView2 != null) {
                            gameTranslationOverlayView2.invalidate();
                        }
                        if (z) {
                            hq2Var.n = true;
                            try {
                                hq2Var.d.c();
                            } catch (Throwable unused2) {
                            }
                        }
                        if (bitmap != null) {
                            if (bitmap.getWidth() == 256 && bitmap.getHeight() == 384) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            hq2.f(this.Z, bitmap, z2, this.e0, null, 8);
                        } else {
                            GameTranslationOverlayView gameTranslationOverlayView3 = hq2Var.l;
                            if (gameTranslationOverlayView3 != null) {
                                gameTranslationOverlayView3.setTranslating(false);
                            }
                            if (hq2Var.n) {
                                hq2Var.n = false;
                                try {
                                    hq2Var.e.c();
                                } catch (Throwable unused3) {
                                }
                            }
                            Toast.makeText(hq2Var.a, (int) R.string.translator_capture_failed, 0).show();
                        }
                        return jg7.a;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.X;
                oi2.Y(obj);
                bitmap2 = (Bitmap) obj;
                if (bitmap2 == null || hq2.b(hq2Var, bitmap2)) {
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    bitmap2 = null;
                }
                if (bitmap2 == null) {
                    wc0 wc0Var = hq2Var.c;
                    eq2 eq2Var = new eq2(hq2Var, null, 4);
                    this.X = i;
                    this.Y = 3;
                    obj = xk2.N(500L, eq2Var, this);
                    i = i;
                }
                bitmap = bitmap2;
                z = i;
                gameTranslationOverlayView = hq2Var.l;
                if (gameTranslationOverlayView != null) {
                }
                gameTranslationOverlayView2 = hq2Var.l;
                if (gameTranslationOverlayView2 != null) {
                }
                if (z) {
                }
                if (bitmap != null) {
                }
                return jg7.a;
            }
            z3 = this.X;
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            z3 = hq2Var.f.getBoolean("translator_pause_on_translate", true);
            eq2 eq2Var2 = new eq2(hq2Var, null, 3);
            this.X = z3;
            this.Y = 1;
            obj = xk2.N(1500L, eq2Var2, this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        bitmap2 = (Bitmap) obj;
        if (bitmap2 != null && hq2.b(hq2Var, bitmap2)) {
            bitmap2.recycle();
            bitmap2 = null;
        }
        i = z3;
        if (bitmap2 == null) {
            this.X = i;
            this.Y = 2;
            hq2Var.getClass();
            xe1 xe1Var = xk1.a;
            obj = hv.d0(e04.a, new dq2(hq2Var, null), this);
        }
        if (bitmap2 == null) {
        }
        bitmap = bitmap2;
        z = i;
        gameTranslationOverlayView = hq2Var.l;
        if (gameTranslationOverlayView != null) {
        }
        gameTranslationOverlayView2 = hq2Var.l;
        if (gameTranslationOverlayView2 != null) {
        }
        if (z) {
        }
        if (bitmap != null) {
        }
        return jg7.a;
    }
}
