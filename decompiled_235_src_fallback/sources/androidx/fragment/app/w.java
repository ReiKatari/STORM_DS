package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class w implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.w> CREATOR = null;
    public final java.lang.String A;
    public final java.lang.String B;
    public final boolean L;
    public final boolean R;
    public final int X;
    public final int Y;
    public final java.lang.String Z;
    public final boolean d0;
    public final boolean e0;
    public final boolean f0;
    public final boolean g0;
    public final int h0;
    public final java.lang.String i0;
    public final int j0;
    public final boolean k0;

    static {
            y8 r0 = new y8
            r1 = 13
            r0.<init>(r1)
            androidx.fragment.app.w.CREATOR = r0
            return
    }

    public w(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.readString()
            r3.A = r0
            java.lang.String r0 = r4.readString()
            r3.B = r0
            int r0 = r4.readInt()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            r3.L = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L24
            r0 = r2
            goto L25
        L24:
            r0 = r1
        L25:
            r3.R = r0
            int r0 = r4.readInt()
            r3.X = r0
            int r0 = r4.readInt()
            r3.Y = r0
            java.lang.String r0 = r4.readString()
            r3.Z = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L41
            r0 = r2
            goto L42
        L41:
            r0 = r1
        L42:
            r3.d0 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L4c
            r0 = r2
            goto L4d
        L4c:
            r0 = r1
        L4d:
            r3.e0 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L57
            r0 = r2
            goto L58
        L57:
            r0 = r1
        L58:
            r3.f0 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L62
            r0 = r2
            goto L63
        L62:
            r0 = r1
        L63:
            r3.g0 = r0
            int r0 = r4.readInt()
            r3.h0 = r0
            java.lang.String r0 = r4.readString()
            r3.i0 = r0
            int r0 = r4.readInt()
            r3.j0 = r0
            int r4 = r4.readInt()
            if (r4 == 0) goto L7e
            r1 = r2
        L7e:
            r3.k0 = r1
            return
    }

    public w(androidx.fragment.app.o r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.A = r0
            java.lang.String r0 = r2.mWho
            r1.B = r0
            boolean r0 = r2.mFromLayout
            r1.L = r0
            boolean r0 = r2.mInDynamicContainer
            r1.R = r0
            int r0 = r2.mFragmentId
            r1.X = r0
            int r0 = r2.mContainerId
            r1.Y = r0
            java.lang.String r0 = r2.mTag
            r1.Z = r0
            boolean r0 = r2.mRetainInstance
            r1.d0 = r0
            boolean r0 = r2.mRemoving
            r1.e0 = r0
            boolean r0 = r2.mDetached
            r1.f0 = r0
            boolean r0 = r2.mHidden
            r1.g0 = r0
            tt3 r0 = r2.mMaxState
            int r0 = r0.ordinal()
            r1.h0 = r0
            java.lang.String r0 = r2.mTargetWho
            r1.i0 = r0
            int r0 = r2.mTargetRequestCode
            r1.j0 = r0
            boolean r2 = r2.mUserVisibleHint
            r1.k0 = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentState{"
            r0.append(r1)
            java.lang.String r1 = r3.A
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r3.B
            r0.append(r1)
            java.lang.String r1 = ")}:"
            r0.append(r1)
            boolean r1 = r3.L
            if (r1 == 0) goto L29
            java.lang.String r1 = " fromLayout"
            r0.append(r1)
        L29:
            boolean r1 = r3.R
            if (r1 == 0) goto L32
            java.lang.String r1 = " dynamicContainer"
            r0.append(r1)
        L32:
            int r1 = r3.Y
            if (r1 == 0) goto L42
            java.lang.String r2 = " id=0x"
            r0.append(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L42:
            java.lang.String r1 = r3.Z
            if (r1 == 0) goto L54
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L54
            java.lang.String r2 = " tag="
            r0.append(r2)
            r0.append(r1)
        L54:
            boolean r1 = r3.d0
            if (r1 == 0) goto L5d
            java.lang.String r1 = " retainInstance"
            r0.append(r1)
        L5d:
            boolean r1 = r3.e0
            if (r1 == 0) goto L66
            java.lang.String r1 = " removing"
            r0.append(r1)
        L66:
            boolean r1 = r3.f0
            if (r1 == 0) goto L6f
            java.lang.String r1 = " detached"
            r0.append(r1)
        L6f:
            boolean r1 = r3.g0
            if (r1 == 0) goto L78
            java.lang.String r1 = " hidden"
            r0.append(r1)
        L78:
            java.lang.String r1 = r3.i0
            if (r1 == 0) goto L8e
            java.lang.String r2 = " targetWho="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " targetRequestCode="
            r0.append(r1)
            int r1 = r3.j0
            r0.append(r1)
        L8e:
            boolean r3 = r3.k0
            if (r3 == 0) goto L97
            java.lang.String r3 = " userVisibleHint"
            r0.append(r3)
        L97:
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.A
            r1.writeString(r2)
            java.lang.String r2 = r0.B
            r1.writeString(r2)
            boolean r2 = r0.L
            r1.writeInt(r2)
            boolean r2 = r0.R
            r1.writeInt(r2)
            int r2 = r0.X
            r1.writeInt(r2)
            int r2 = r0.Y
            r1.writeInt(r2)
            java.lang.String r2 = r0.Z
            r1.writeString(r2)
            boolean r2 = r0.d0
            r1.writeInt(r2)
            boolean r2 = r0.e0
            r1.writeInt(r2)
            boolean r2 = r0.f0
            r1.writeInt(r2)
            boolean r2 = r0.g0
            r1.writeInt(r2)
            int r2 = r0.h0
            r1.writeInt(r2)
            java.lang.String r2 = r0.i0
            r1.writeString(r2)
            int r2 = r0.j0
            r1.writeInt(r2)
            boolean r0 = r0.k0
            r1.writeInt(r0)
            return
    }
}
