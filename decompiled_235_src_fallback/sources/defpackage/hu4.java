package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hu4  reason: default package */
/* loaded from: classes.dex */
public abstract class hu4 {
    public final boolean a;
    public final boolean b;

    public hu4(int r4) {
            r3 = this;
            r0 = r4 & 1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            r1 = r2
        Le:
            r3.<init>()
            r3.a = r0
            r3.b = r1
            return
    }
}
