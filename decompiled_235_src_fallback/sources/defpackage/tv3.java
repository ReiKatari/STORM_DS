package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tv3  reason: default package */
/* loaded from: classes.dex */
public final class tv3 {
    public defpackage.sv3 a;
    public final java.lang.StringBuilder b;
    public final java.util.ArrayList c;
    public java.lang.StringBuilder d;
    public java.lang.String e;
    public java.lang.String f;
    public char g;
    public java.lang.StringBuilder h;
    public boolean i;

    public tv3() {
            r1 = this;
            r1.<init>()
            sv3 r0 = defpackage.sv3.START_DEFINITION
            r1.a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            r0 = 0
            r1.i = r0
            return
    }

    public final void a() {
            r5 = this;
            boolean r0 = r5.i
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = r5.f
            java.lang.String r0 = defpackage.c62.a(r0)
            java.lang.StringBuilder r1 = r5.h
            r2 = 0
            if (r1 == 0) goto L19
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = defpackage.c62.a(r1)
            goto L1a
        L19:
            r1 = r2
        L1a:
            qv3 r3 = new qv3
            java.lang.String r4 = r5.e
            r3.<init>()
            r3.g = r4
            r3.h = r0
            r3.i = r1
            java.util.ArrayList r0 = r5.c
            r0.add(r3)
            r5.d = r2
            r0 = 0
            r5.i = r0
            r5.e = r2
            r5.f = r2
            r5.h = r2
            return
    }
}
