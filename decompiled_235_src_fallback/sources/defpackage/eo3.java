package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo3  reason: default package */
/* loaded from: classes.dex */
public final class eo3 extends defpackage.m20 {
    public final defpackage.kd6 e;
    public final defpackage.tp6 f;
    public final defpackage.de5 g;

    public eo3(defpackage.wa3 r4, defpackage.kd6 r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r3.<init>(r4)
            r3.e = r5
            ba6 r0 = new ba6
            ng6 r5 = (defpackage.ng6) r5
            java.util.UUID r5 = r5.v()
            aa6 r1 = defpackage.aa6.INITIAL_SELECTION
            r0.<init>(r5, r1)
            tp6 r5 = defpackage.up6.a(r0)
            r3.f = r5
            de5 r0 = new de5
            r0.<init>(r5)
            r3.g = r0
            as0 r5 = defpackage.to7.a(r3)
            xd1 r0 = new xd1
            r1 = 23
            r2 = 0
            r0.<init>(r4, r3, r2, r1)
            r3 = 3
            defpackage.hv.L(r5, r2, r2, r0, r3)
            return
    }

    @Override // defpackage.m20
    public final void e() {
            r2 = this;
            java.util.UUID r0 = defpackage.fk3.h
            java.util.UUID r0 = defpackage.fk3.h
            aa6 r1 = defpackage.aa6.SELECTED_BY_FALLBACK
            r2.h(r0, r1)
            return
    }

    @Override // defpackage.m20
    public final defpackage.de5 f() {
            r0 = this;
            de5 r0 = r0.g
            return r0
    }

    @Override // defpackage.m20
    public final void g(java.util.UUID r2) {
            r1 = this;
            if (r2 == 0) goto L7
            aa6 r0 = defpackage.aa6.SELECTED_BY_USER
            r1.h(r2, r0)
        L7:
            return
    }

    public final void h(java.util.UUID r4, defpackage.aa6 r5) {
            r3 = this;
            kd6 r0 = r3.e
            ng6 r0 = (defpackage.ng6) r0
            r0.getClass()
            r4.getClass()
            android.content.SharedPreferences r0 = r0.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "input_layout_id"
            java.lang.String r2 = r4.toString()
            r0.putString(r1, r2)
            r0.apply()
            ba6 r0 = new ba6
            r0.<init>(r4, r5)
            tp6 r3 = r3.f
            r3.getClass()
            r4 = 0
            r3.m(r4, r0)
            return
    }
}
