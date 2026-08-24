package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ks4  reason: default package */
/* loaded from: classes.dex */
public final class ks4 extends defpackage.uj2 {
    public final /* synthetic */ int h;
    public final java.lang.reflect.Method i;
    public final int j;
    public final defpackage.b51 k;
    public final java.lang.Object l;

    public ks4(java.lang.reflect.Method r2, int r3, defpackage.b51 r4, java.lang.String r5) {
            r1 = this;
            r0 = 1
            r1.h = r0
            r1.<init>()
            r1.i = r2
            r1.j = r3
            r1.k = r4
            r1.l = r5
            return
    }

    public ks4(java.lang.reflect.Method r2, int r3, defpackage.yw2 r4, defpackage.b51 r5) {
            r1 = this;
            r0 = 0
            r1.h = r0
            r1.<init>()
            r1.i = r2
            r1.j = r3
            r1.l = r4
            r1.k = r5
            return
    }

    @Override // defpackage.uj2
    public final void l(defpackage.ok5 r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.h
            b51 r1 = r9.k
            java.lang.Object r2 = r9.l
            java.lang.reflect.Method r3 = r9.i
            int r9 = r9.j
            switch(r0) {
                case 0: goto L79;
                default: goto Ld;
            }
        Ld:
            java.util.Map r11 = (java.util.Map) r11
            r0 = 0
            if (r11 == 0) goto L70
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L1a:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L6f
            java.lang.Object r4 = r11.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L66
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L57
            java.lang.String r6 = "form-data; name=\""
            java.lang.String r7 = "\""
            java.lang.String r5 = defpackage.lb1.A(r6, r5, r7)
            java.lang.String r6 = "Content-Transfer-Encoding"
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "Content-Disposition"
            java.lang.String[] r5 = new java.lang.String[]{r8, r5, r6, r7}
            yw2 r6 = defpackage.yw2.B
            yw2 r5 = defpackage.ln2.R(r5)
            java.lang.Object r4 = r1.h(r4)
            mk5 r4 = (defpackage.mk5) r4
            r10.c(r5, r4)
            goto L1a
        L57:
            java.lang.String r10 = "Part map contained null value for key '"
            java.lang.String r11 = "'."
            java.lang.String r10 = defpackage.lb1.A(r10, r5, r11)
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r9 = defpackage.ak7.v0(r3, r9, r10, r11)
            throw r9
        L66:
            java.lang.String r10 = "Part map contained null key."
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r9 = defpackage.ak7.v0(r3, r9, r10, r11)
            throw r9
        L6f:
            return
        L70:
            java.lang.String r10 = "Part map was null."
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r9 = defpackage.ak7.v0(r3, r9, r10, r11)
            throw r9
        L79:
            if (r11 != 0) goto L7c
            goto L87
        L7c:
            java.lang.Object r0 = r1.h(r11)     // Catch: java.io.IOException -> L88
            mk5 r0 = (defpackage.mk5) r0     // Catch: java.io.IOException -> L88
            yw2 r2 = (defpackage.yw2) r2
            r10.c(r2, r0)
        L87:
            return
        L88:
            r10 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to convert "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = " to RequestBody"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.IllegalArgumentException r9 = defpackage.ak7.v0(r3, r9, r11, r10)
            throw r9
    }
}
