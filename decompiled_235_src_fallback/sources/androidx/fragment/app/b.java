package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.b> CREATOR = null;
    public final int[] A;
    public final java.util.ArrayList B;
    public final int[] L;
    public final int[] R;
    public final int X;
    public final java.lang.String Y;
    public final int Z;
    public final int d0;
    public final java.lang.CharSequence e0;
    public final int f0;
    public final java.lang.CharSequence g0;
    public final java.util.ArrayList h0;
    public final java.util.ArrayList i0;
    public final boolean j0;

    static {
            y8 r0 = new y8
            r1 = 2
            r0.<init>(r1)
            androidx.fragment.app.b.CREATOR = r0
            return
    }

    public b(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int[] r0 = r3.createIntArray()
            r2.A = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.B = r0
            int[] r0 = r3.createIntArray()
            r2.L = r0
            int[] r0 = r3.createIntArray()
            r2.R = r0
            int r0 = r3.readInt()
            r2.X = r0
            java.lang.String r0 = r3.readString()
            r2.Y = r0
            int r0 = r3.readInt()
            r2.Z = r0
            int r0 = r3.readInt()
            r2.d0 = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r1 = r0.createFromParcel(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.e0 = r1
            int r1 = r3.readInt()
            r2.f0 = r1
            java.lang.Object r0 = r0.createFromParcel(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.g0 = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.h0 = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.i0 = r0
            int r3 = r3.readInt()
            if (r3 == 0) goto L5f
            r3 = 1
            goto L60
        L5f:
            r3 = 0
        L60:
            r2.j0 = r3
            return
    }

    public b(androidx.fragment.app.a r10) {
            r9 = this;
            r9.<init>()
            java.util.ArrayList r0 = r10.c
            int r0 = r0.size()
            int r1 = r0 * 6
            int[] r1 = new int[r1]
            r9.A = r1
            boolean r1 = r10.i
            r2 = 0
            if (r1 == 0) goto La4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r9.B = r1
            int[] r1 = new int[r0]
            r9.L = r1
            int[] r1 = new int[r0]
            r9.R = r1
            r1 = 0
            r3 = r1
        L25:
            if (r1 >= r0) goto L7b
            java.util.ArrayList r4 = r10.c
            java.lang.Object r4 = r4.get(r1)
            ul2 r4 = (defpackage.ul2) r4
            int[] r5 = r9.A
            int r6 = r3 + 1
            int r7 = r4.a
            r5[r3] = r7
            java.util.ArrayList r5 = r9.B
            androidx.fragment.app.o r7 = r4.b
            if (r7 == 0) goto L40
            java.lang.String r7 = r7.mWho
            goto L41
        L40:
            r7 = r2
        L41:
            r5.add(r7)
            int[] r5 = r9.A
            int r7 = r3 + 2
            boolean r8 = r4.c
            r5[r6] = r8
            int r6 = r3 + 3
            int r8 = r4.d
            r5[r7] = r8
            int r7 = r3 + 4
            int r8 = r4.e
            r5[r6] = r8
            int r6 = r3 + 5
            int r8 = r4.f
            r5[r7] = r8
            int r3 = r3 + 6
            int r7 = r4.g
            r5[r6] = r7
            int[] r5 = r9.L
            tt3 r6 = r4.h
            int r6 = r6.ordinal()
            r5[r1] = r6
            int[] r5 = r9.R
            tt3 r4 = r4.i
            int r4 = r4.ordinal()
            r5[r1] = r4
            int r1 = r1 + 1
            goto L25
        L7b:
            int r0 = r10.h
            r9.X = r0
            java.lang.String r0 = r10.k
            r9.Y = r0
            int r0 = r10.v
            r9.Z = r0
            int r0 = r10.l
            r9.d0 = r0
            java.lang.CharSequence r0 = r10.m
            r9.e0 = r0
            int r0 = r10.n
            r9.f0 = r0
            java.lang.CharSequence r0 = r10.o
            r9.g0 = r0
            java.util.ArrayList r0 = r10.p
            r9.h0 = r0
            java.util.ArrayList r0 = r10.q
            r9.i0 = r0
            boolean r10 = r10.r
            r9.j0 = r10
            return
        La4:
            java.lang.String r9 = "Not on back stack"
            defpackage.i.m(r9)
            throw r2
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int[] r3 = r1.A
            r2.writeIntArray(r3)
            java.util.ArrayList r3 = r1.B
            r2.writeStringList(r3)
            int[] r3 = r1.L
            r2.writeIntArray(r3)
            int[] r3 = r1.R
            r2.writeIntArray(r3)
            int r3 = r1.X
            r2.writeInt(r3)
            java.lang.String r3 = r1.Y
            r2.writeString(r3)
            int r3 = r1.Z
            r2.writeInt(r3)
            int r3 = r1.d0
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.e0
            r0 = 0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            int r3 = r1.f0
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.g0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            java.util.ArrayList r3 = r1.h0
            r2.writeStringList(r3)
            java.util.ArrayList r3 = r1.i0
            r2.writeStringList(r3)
            boolean r1 = r1.j0
            r2.writeInt(r1)
            return
    }
}
