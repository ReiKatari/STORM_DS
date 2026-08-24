package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: is4  reason: default package */
/* loaded from: classes.dex */
public final class is4 extends defpackage.uj2 {
    public final /* synthetic */ int h;
    public final java.lang.reflect.Method i;
    public final int j;
    public final boolean k;

    public /* synthetic */ is4(java.lang.reflect.Method r1, int r2, boolean r3, int r4) {
            r0 = this;
            r0.h = r4
            r0.i = r1
            r0.j = r2
            r0.k = r3
            r0.<init>()
            return
    }

    @Override // defpackage.uj2
    public final void l(defpackage.ok5 r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.h
            java.lang.String r1 = " for key '"
            java.lang.Class<d90> r2 = defpackage.d90.class
            java.lang.String r3 = "' converted to null by "
            boolean r4 = r10.k
            java.lang.reflect.Method r5 = r10.i
            int r10 = r10.j
            r6 = 0
            java.lang.String r7 = "'."
            switch(r0) {
                case 0: goto Lda;
                case 1: goto L8c;
                default: goto L14;
            }
        L14:
            java.util.Map r12 = (java.util.Map) r12
            if (r12 == 0) goto L83
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L20:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getKey()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L79
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L6c
            java.lang.String r9 = r0.toString()
            if (r9 == 0) goto L44
            r11.d(r8, r9, r4)
            goto L20
        L44:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Query map value '"
            r11.<init>(r12)
            r11.append(r0)
            r11.append(r3)
            java.lang.String r12 = r2.getName()
            r11.append(r12)
            r11.append(r1)
            r11.append(r8)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.IllegalArgumentException r10 = defpackage.ak7.v0(r5, r10, r11, r12)
            throw r10
        L6c:
            java.lang.String r11 = "Query map contained null value for key '"
            java.lang.String r11 = defpackage.lb1.A(r11, r8, r7)
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.IllegalArgumentException r10 = defpackage.ak7.v0(r5, r10, r11, r12)
            throw r10
        L79:
            java.lang.String r11 = "Query map contained null key."
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.IllegalArgumentException r10 = defpackage.ak7.v0(r5, r10, r11, r12)
            throw r10
        L82:
            return
        L83:
            java.lang.String r11 = "Query map was null"
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.IllegalArgumentException r10 = defpackage.ak7.v0(r5, r10, r11, r12)
            throw r10
        L8c:
            java.util.Map r12 = (java.util.Map) r12
            if (r12 == 0) goto Ld1
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L98:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Ld0
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lc7
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto Lba
            java.lang.String r0 = r0.toString()
            r11.b(r1, r0, r4)
            goto L98
        Lba:
            java.lang.String r11 = "Header map contained null value for key '"
            java.lang.String r11 = defpackage.lb1.A(r11, r1, r7)
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.IllegalArgumentException r10 = defpackage.ak7.v0(r5, r10, r11, r12)
            throw r10
        Lc7:
            java.lang.String r11 = "Header map contained null key."
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.IllegalArgumentException r10 = defpackage.ak7.v0(r5, r10, r11, r12)
            throw r10
        Ld0:
            return
        Ld1:
            java.lang.String r11 = "Header map was null."
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.IllegalArgumentException r10 = defpackage.ak7.v0(r5, r10, r11, r12)
            throw r10
        Lda:
            java.util.Map r12 = (java.util.Map) r12
            if (r12 == 0) goto L149
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        Le6:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L148
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getKey()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L13f
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L132
            java.lang.String r9 = r0.toString()
            if (r9 == 0) goto L10a
            r11.a(r8, r9, r4)
            goto Le6
        L10a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Field map value '"
            r11.<init>(r12)
            r11.append(r0)
            r11.append(r3)
            java.lang.String r12 = r2.getName()
            r11.append(r12)
            r11.append(r1)
            r11.append(r8)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.IllegalArgumentException r10 = defpackage.ak7.v0(r5, r10, r11, r12)
            throw r10
        L132:
            java.lang.String r11 = "Field map contained null value for key '"
            java.lang.String r11 = defpackage.lb1.A(r11, r8, r7)
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.IllegalArgumentException r10 = defpackage.ak7.v0(r5, r10, r11, r12)
            throw r10
        L13f:
            java.lang.String r11 = "Field map contained null key."
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.IllegalArgumentException r10 = defpackage.ak7.v0(r5, r10, r11, r12)
            throw r10
        L148:
            return
        L149:
            java.lang.String r11 = "Field map was null."
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.IllegalArgumentException r10 = defpackage.ak7.v0(r5, r10, r11, r12)
            throw r10
    }
}
