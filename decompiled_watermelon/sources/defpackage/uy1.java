package defpackage;

import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uy1  reason: default package */
/* loaded from: classes.dex */
public final class uy1 implements w92 {
    public final /* synthetic */ hv1 A;

    public uy1(hv1 hv1Var) {
        this.A = hv1Var;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        VideoRenderer y;
        zr1 zr1Var = (zr1) obj;
        hv1 hv1Var = this.A;
        ee6 ee6Var = hv1Var.p0;
        c46 c46Var = hv1Var.D0;
        c46 c46Var2 = hv1Var.J0;
        if (zr1Var instanceof ur1) {
            c46Var.p(new wr5(((ur1) zr1Var).a));
        } else if (b53.x(zr1Var, vr1.a)) {
            c46Var.p(xr5.a);
        } else {
            VideoRenderer videoRenderer = null;
            if (zr1Var instanceof tr1) {
                hv1Var.U = true;
                w16 w16Var = hv1Var.c;
                VideoRenderer videoRenderer2 = ((tr1) zr1Var).a;
                b56 b56Var = (b56) w16Var;
                VideoRenderer e = b56Var.e();
                if (e == videoRenderer2) {
                    videoRenderer = e;
                }
                if (videoRenderer != null && (y = hv1.y(hv1Var)) != null && y != videoRenderer2) {
                    b56Var.getClass();
                    SharedPreferences.Editor edit = b56Var.b.edit();
                    String lowerCase = y.name().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    edit.putString("video_renderer", lowerCase);
                    edit.apply();
                }
                c46Var2.p(new vu6(videoRenderer2));
            } else if (zr1Var instanceof yr1) {
                yr1 yr1Var = (yr1) zr1Var;
                vc7 vc7Var = new vc7(yr1Var.a, yr1Var.b, yr1Var.c);
                wt1 wt1Var = (wt1) ee6Var.getValue();
                if (wt1Var instanceof ot1) {
                    ee6Var.l(null, new ot1(vc7Var, ((ot1) wt1Var).b));
                } else if (wt1Var instanceof nt1) {
                    ee6Var.l(null, new nt1(vc7Var));
                }
            } else if (zr1Var instanceof xr1) {
                int i = ty1.a[((xr1) zr1Var).a.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            i.c();
                            return null;
                        }
                    } else if (!hv1Var.U) {
                        c46Var2.p(hu6.a);
                    }
                } else {
                    c46Var2.p(eu6.a);
                }
                wt1 wt1Var2 = (wt1) ee6Var.getValue();
                if (wt1Var2 instanceof ot1) {
                    hv1Var.c1();
                    ee6Var.getClass();
                    ee6Var.l(null, pt1.a);
                } else if (wt1Var2 instanceof nt1) {
                    hv1Var.c1();
                    mt1 mt1Var = new mt1(MelonEmulator.a.FIRMWARE_BAD);
                    ee6Var.getClass();
                    ee6Var.l(null, mt1Var);
                } else {
                    ((AtomicBoolean) hv1Var.V.A).set(true);
                    hv1Var.S0(c35.TERMINAL_STOP);
                }
            } else {
                i.c();
                return null;
            }
        }
        return o27.a;
    }
}
