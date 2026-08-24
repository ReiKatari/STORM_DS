package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: at1  reason: default package */
/* loaded from: classes.dex */
public final class at1 extends android.text.Editable.Factory {
    public static final java.lang.Object a = null;
    public static volatile defpackage.at1 b;
    public static java.lang.Class c;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.at1.a = r0
            return
    }

    @Override // android.text.Editable.Factory
    public final android.text.Editable newEditable(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.Class r0 = defpackage.at1.c
            if (r0 == 0) goto La
            tn6 r1 = new tn6
            r1.<init>(r0, r2)
            return r1
        La:
            android.text.Editable r1 = super.newEditable(r2)
            return r1
    }
}
