package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w0  reason: default package */
/* loaded from: classes.dex */
public class w0 implements java.util.Iterator, defpackage.zf3 {
    public final /* synthetic */ int A;
    public int B;
    public final java.lang.Object L;

    public /* synthetic */ w0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.L = r1
            r0.<init>()
            return
    }

    public w0(defpackage.s52 r2) {
            r1 = this;
            r0 = 4
            r1.A = r0
            r1.<init>()
            r1.L = r2
            int r2 = r2.c
            r1.B = r2
            return
    }

    public w0(defpackage.wb6 r2) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            r1.L = r2
            int r2 = r2.f()
            r1.B = r2
            return
    }

    public w0(java.lang.Object[] r2) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.L = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.A
            java.lang.Object r1 = r4.L
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L63;
                case 1: goto L5a;
                case 2: goto L51;
                case 3: goto L4b;
                case 4: goto L45;
                case 5: goto L39;
                case 6: goto L30;
                case 7: goto L27;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L9;
            }
        L9:
            int r4 = r4.B
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r0 = r1.getChildCount()
            if (r4 >= r0) goto L14
            r2 = r3
        L14:
            return r2
        L15:
            int r4 = r4.B
            short[] r1 = (short[]) r1
            int r0 = r1.length
            if (r4 >= r0) goto L1d
            r2 = r3
        L1d:
            return r2
        L1e:
            int r4 = r4.B
            long[] r1 = (long[]) r1
            int r0 = r1.length
            if (r4 >= r0) goto L26
            r2 = r3
        L26:
            return r2
        L27:
            int r4 = r4.B
            int[] r1 = (int[]) r1
            int r0 = r1.length
            if (r4 >= r0) goto L2f
            r2 = r3
        L2f:
            return r2
        L30:
            int r4 = r4.B
            byte[] r1 = (byte[]) r1
            int r0 = r1.length
            if (r4 >= r0) goto L38
            r2 = r3
        L38:
            return r2
        L39:
            int r4 = r4.B
            un6 r1 = (defpackage.un6) r1
            int r0 = r1.f()
            if (r4 >= r0) goto L44
            r2 = r3
        L44:
            return r2
        L45:
            int r4 = r4.B
            if (r4 <= 0) goto L4a
            r2 = r3
        L4a:
            return r2
        L4b:
            int r4 = r4.B
            if (r4 <= 0) goto L50
            r2 = r3
        L50:
            return r2
        L51:
            int r4 = r4.B
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r0 = r1.length
            if (r4 >= r0) goto L59
            r2 = r3
        L59:
            return r2
        L5a:
            int r4 = r4.B
            float[] r1 = (float[]) r1
            int r0 = r1.length
            if (r4 >= r0) goto L62
            r2 = r3
        L62:
            return r2
        L63:
            int r4 = r4.B
            z0 r1 = (defpackage.z0) r1
            int r0 = r1.a()
            if (r4 >= r0) goto L6e
            r2 = r3
        L6e:
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            java.lang.Object r2 = r4.L
            switch(r0) {
                case 0: goto Lf1;
                case 1: goto Ld3;
                case 2: goto Lb9;
                case 3: goto La7;
                case 4: goto L97;
                case 5: goto L8a;
                case 6: goto L6f;
                case 7: goto L54;
                case 8: goto L38;
                case 9: goto L1d;
                default: goto L8;
            }
        L8:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r0 = r4.B
            int r1 = r0 + 1
            r4.B = r1
            android.view.View r4 = r2.getChildAt(r0)
            if (r4 == 0) goto L17
            return r4
        L17:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            r4.<init>()
            throw r4
        L1d:
            int r0 = r4.B
            short[] r2 = (short[]) r2
            int r3 = r2.length
            if (r0 >= r3) goto L30
            int r1 = r0 + 1
            r4.B = r1
            short r4 = r2[r0]
            xf7 r1 = new xf7
            r1.<init>(r4)
            goto L37
        L30:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            defpackage.fa6.e(r4)
        L37:
            return r1
        L38:
            int r0 = r4.B
            long[] r2 = (long[]) r2
            int r3 = r2.length
            if (r0 >= r3) goto L4c
            int r1 = r0 + 1
            r4.B = r1
            r0 = r2[r0]
            rf7 r4 = new rf7
            r4.<init>(r0)
            r1 = r4
            goto L53
        L4c:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            defpackage.fa6.e(r4)
        L53:
            return r1
        L54:
            int r0 = r4.B
            int[] r2 = (int[]) r2
            int r3 = r2.length
            if (r0 >= r3) goto L67
            int r1 = r0 + 1
            r4.B = r1
            r4 = r2[r0]
            mf7 r1 = new mf7
            r1.<init>(r4)
            goto L6e
        L67:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            defpackage.fa6.e(r4)
        L6e:
            return r1
        L6f:
            int r0 = r4.B
            byte[] r2 = (byte[]) r2
            int r3 = r2.length
            if (r0 >= r3) goto L82
            int r1 = r0 + 1
            r4.B = r1
            r4 = r2[r0]
            ze7 r1 = new ze7
            r1.<init>(r4)
            goto L89
        L82:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            defpackage.fa6.e(r4)
        L89:
            return r1
        L8a:
            un6 r2 = (defpackage.un6) r2
            int r0 = r4.B
            int r1 = r0 + 1
            r4.B = r1
            java.lang.Object r4 = r2.g(r0)
            return r4
        L97:
            s52 r2 = (defpackage.s52) r2
            int r0 = r2.c
            int r1 = r4.B
            int r3 = r1 + (-1)
            r4.B = r3
            int r0 = r0 - r1
            java.lang.String[] r4 = r2.e
            r4 = r4[r0]
            return r4
        La7:
            wb6 r2 = (defpackage.wb6) r2
            int r0 = r2.f()
            int r1 = r4.B
            int r3 = r1 + (-1)
            r4.B = r3
            int r0 = r0 - r1
            wb6 r4 = r2.j(r0)
            return r4
        Lb9:
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lc4
            int r0 = r4.B     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lc4
            int r3 = r0 + 1
            r4.B = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lc4
            r1 = r2[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lc4
            goto Ld2
        Lc4:
            r0 = move-exception
            int r2 = r4.B
            int r2 = r2 + (-1)
            r4.B = r2
            java.lang.String r4 = r0.getMessage()
            defpackage.fa6.e(r4)
        Ld2:
            return r1
        Ld3:
            float[] r2 = (float[]) r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le2
            int r0 = r4.B     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le2
            int r3 = r0 + 1
            r4.B = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le2
            r4 = r2[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le2
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            goto Lf0
        Le2:
            r0 = move-exception
            int r2 = r4.B
            int r2 = r2 + (-1)
            r4.B = r2
            java.lang.String r4 = r0.getMessage()
            defpackage.fa6.e(r4)
        Lf0:
            return r1
        Lf1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L104
            z0 r2 = (defpackage.z0) r2
            int r0 = r4.B
            int r1 = r0 + 1
            r4.B = r1
            java.lang.Object r1 = r2.get(r0)
            goto L107
        L104:
            defpackage.fa6.c()
        L107:
            return r1
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto L5b;
                case 1: goto L53;
                case 2: goto L4b;
                case 3: goto L43;
                case 4: goto L3b;
                case 5: goto L33;
                case 6: goto L2b;
                case 7: goto L23;
                case 8: goto L1b;
                case 9: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.L
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r2.B
            int r1 = r1 + (-1)
            r2.B = r1
            r0.removeViewAt(r1)
            return
        L13:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L1b:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L23:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L2b:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L33:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L3b:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L43:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L4b:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L53:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L5b:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }
}
