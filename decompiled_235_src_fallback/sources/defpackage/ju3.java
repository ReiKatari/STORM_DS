package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju3  reason: default package */
/* loaded from: classes.dex */
public final class ju3 {
    public defpackage.tt3 a;
    public defpackage.fu3 b;

    public final void a(defpackage.hu3 r4, defpackage.st3 r5) {
            r3 = this;
            tt3 r0 = r5.getTargetState()
            tt3 r1 = r3.a
            r1.getClass()
            if (r0 == 0) goto L12
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L12
            r1 = r0
        L12:
            r3.a = r1
            fu3 r1 = r3.b
            r1.h(r4, r5)
            r3.a = r0
            return
    }
}
