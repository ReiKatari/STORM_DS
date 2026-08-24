package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl4  reason: default package */
/* loaded from: classes.dex */
public final class bl4 implements OnBackAnimationCallback {
    public final /* synthetic */ al4 a;

    public bl4(al4 al4Var) {
        this.a = al4Var;
    }

    public final void onBackCancelled() {
        al4 al4Var = this.a;
        eb ebVar = al4Var.a;
        if (ebVar != null) {
            if (!al4Var.b) {
                ebVar.v(al4Var, null);
            }
            md4 md4Var = (md4) ebVar.L;
            md4Var.getClass();
            if (al4Var.equals(md4Var.h) && -1 == md4Var.g) {
                jd4 jd4Var = md4Var.f;
                if (jd4Var == null) {
                    jd4Var = md4Var.c(-1);
                }
                md4Var.f = null;
                md4Var.g = 0;
                md4Var.h = null;
                if (jd4Var != null) {
                    jd4Var.a();
                }
                tp6 tp6Var = md4Var.a;
                tp6Var.getClass();
                tp6Var.m(null, nd4.i);
            }
            al4Var.b = false;
            return;
        }
        i.m("This input is not added to any dispatcher.");
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        hd4 e = uj2.e(backEvent);
        al4 al4Var = this.a;
        eb ebVar = al4Var.a;
        if (ebVar != null) {
            if (al4Var.b) {
                md4 md4Var = (md4) ebVar.L;
                md4Var.getClass();
                if (al4Var.equals(md4Var.h) && -1 == md4Var.g) {
                    jd4 jd4Var = md4Var.f;
                    if (jd4Var == null) {
                        jd4Var = md4Var.c(-1);
                    }
                    if (jd4Var != null) {
                        jd4Var.c(e);
                    }
                    tp6 tp6Var = md4Var.a;
                    od4 od4Var = new od4(e);
                    tp6Var.getClass();
                    tp6Var.m(null, od4Var);
                    return;
                }
                return;
            }
            return;
        }
        i.m("This input is not added to any dispatcher.");
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        hd4 e = uj2.e(backEvent);
        al4 al4Var = this.a;
        eb ebVar = al4Var.a;
        if (ebVar != null) {
            if (!al4Var.b) {
                ebVar.v(al4Var, e);
                al4Var.b = true;
                return;
            }
            return;
        }
        i.m("This input is not added to any dispatcher.");
    }
}
