package defpackage;

import java.util.UUID;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sl5  reason: default package */
/* loaded from: classes.dex */
public final class sl5 extends ra7 {
    public final ml5 b;
    public final vp5 c;
    public final w16 d;
    public final y37 e;
    public final ee6 f;
    public final q45 g;
    public final ee6 h;
    public final il6 i;

    public sl5(ml5 ml5Var, vp5 vp5Var, w16 w16Var, vm5 vm5Var, y37 y37Var, pt5 pt5Var) {
        ml5Var.getClass();
        vp5Var.getClass();
        w16Var.getClass();
        vm5Var.getClass();
        y37Var.getClass();
        pt5Var.getClass();
        this.b = ml5Var;
        this.c = vp5Var;
        this.d = w16Var;
        this.e = y37Var;
        Object a = pt5Var.a("rom");
        a.getClass();
        ee6 a2 = fe6.a(((bp5) a).A);
        this.f = a2;
        this.g = new q45(a2);
        this.h = fe6.a(((rg5) a2.getValue()).f);
        tq5.w(ua7.a(this), null, null, new ys3(this, null, 8), 3);
        this.i = new il6(new bz2(15, this));
    }

    public static final boolean e(sl5 sl5Var, rg5 rg5Var) {
        ti5 ti5Var;
        if (rg5Var.h) {
            ti5Var = new ti5(cs5.DSi, is5.DEFAULT, (UUID) null, (me2) fm5.d, (String) null, false, ym5.GLOBAL, (m11) null, (VideoRenderer) null, (Boolean) null, (Integer) null, (VideoFiltering) null, (String) null, (String) null, (Boolean) null);
        } else {
            ti5Var = new ti5((cs5) null, (is5) null, (UUID) null, (me2) null, (String) null, false, (ym5) null, (m11) null, (VideoRenderer) null, (Boolean) null, (Integer) null, (VideoFiltering) null, (String) null, (String) null, 32767);
        }
        return b53.x(rg5Var.f, ti5Var);
    }
}
