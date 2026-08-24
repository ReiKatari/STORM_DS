package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv3  reason: default package */
/* loaded from: classes.dex */
public final class mv3 extends defpackage.a21 {
    public final java.lang.String g;
    public final java.lang.String h;

    public mv3(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.g = r1
            r0.h = r2
            return
    }

    @Override // defpackage.a21
    public final void a(defpackage.eb r1) {
            r0 = this;
            r1.P(r0)
            return
    }

    @Override // defpackage.a21
    public final java.lang.String i() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "destination="
            r0.<init>(r1)
            java.lang.String r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r2 = r2.h
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
