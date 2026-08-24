package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jj0  reason: default package */
/* loaded from: classes.dex */
public final class jj0 implements defpackage.fh2 {
    public static final defpackage.jj0 a = null;
    public static java.lang.Boolean b;

    static {
            jj0 r0 = new jj0
            r0.<init>()
            defpackage.jj0.a = r0
            return
    }

    @Override // defpackage.fh2
    public final void a() {
            r0 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            defpackage.jj0.b = r0
            return
    }

    @Override // defpackage.fh2
    public final boolean b() {
            r0 = this;
            java.lang.Boolean r0 = defpackage.jj0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            java.lang.String r0 = "canFocus is read before it is written"
            ug r0 = defpackage.i61.e(r0)
            throw r0
    }
}
