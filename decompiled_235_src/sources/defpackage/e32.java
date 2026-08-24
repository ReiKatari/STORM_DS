package defpackage;

import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e32  reason: default package */
/* loaded from: classes.dex */
public final class e32 implements ne2 {
    public final /* synthetic */ sz1 A;

    public e32(sz1 sz1Var) {
        this.A = sz1Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        VideoRenderer x;
        lw1 lw1Var = (lw1) obj;
        sz1 sz1Var = this.A;
        tp6 tp6Var = sz1Var.p0;
        of6 of6Var = sz1Var.D0;
        of6 of6Var2 = sz1Var.J0;
        if (lw1Var instanceof gw1) {
            of6Var.k(new p26(((gw1) lw1Var).a));
        } else if (nb3.k(lw1Var, hw1.a)) {
            of6Var.k(q26.a);
        } else {
            VideoRenderer videoRenderer = null;
            if (lw1Var instanceof fw1) {
                sz1Var.U = true;
                kd6 kd6Var = sz1Var.c;
                VideoRenderer videoRenderer2 = ((fw1) lw1Var).a;
                ng6 ng6Var = (ng6) kd6Var;
                VideoRenderer e = ng6Var.e();
                if (e == videoRenderer2) {
                    videoRenderer = e;
                }
                if (videoRenderer != null && (x = sz1.x(sz1Var)) != null && x != videoRenderer2) {
                    ng6Var.getClass();
                    SharedPreferences.Editor edit = ng6Var.b.edit();
                    String lowerCase = x.name().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    edit.putString("video_renderer", lowerCase);
                    edit.apply();
                }
                of6Var2.k(new m77(videoRenderer2));
            } else if (lw1Var instanceof kw1) {
                kw1 kw1Var = (kw1) lw1Var;
                xq7 xq7Var = new xq7(kw1Var.a, kw1Var.b, kw1Var.c);
                hy1 hy1Var = (hy1) tp6Var.getValue();
                if (hy1Var instanceof zx1) {
                    tp6Var.m(null, new zx1(xq7Var, ((zx1) hy1Var).b));
                } else if (hy1Var instanceof yx1) {
                    tp6Var.m(null, new yx1(xq7Var));
                }
            } else if (lw1Var instanceof jw1) {
                int i = d32.a[((jw1) lw1Var).a.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            i.d();
                            return null;
                        }
                    } else if (!sz1Var.U) {
                        of6Var2.k(y67.a);
                    }
                } else {
                    of6Var2.k(v67.a);
                }
                hy1 hy1Var2 = (hy1) tp6Var.getValue();
                if (hy1Var2 instanceof zx1) {
                    sz1Var.a1();
                    tp6Var.getClass();
                    tp6Var.m(null, ay1.a);
                } else if (hy1Var2 instanceof yx1) {
                    sz1Var.a1();
                    xx1 xx1Var = new xx1(MelonEmulator.a.FIRMWARE_BAD);
                    tp6Var.getClass();
                    tp6Var.m(null, xx1Var);
                } else {
                    ((AtomicBoolean) sz1Var.V.A).set(true);
                    sz1Var.Q0(mc5.TERMINAL_STOP);
                }
            } else {
                i.d();
                return null;
            }
        }
        return jg7.a;
    }
}
