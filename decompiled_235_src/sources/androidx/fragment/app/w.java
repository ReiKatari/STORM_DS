package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new y8(13);
    public final String A;
    public final String B;
    public final boolean L;
    public final boolean R;
    public final int X;
    public final int Y;
    public final String Z;
    public final boolean d0;
    public final boolean e0;
    public final boolean f0;
    public final boolean g0;
    public final int h0;
    public final String i0;
    public final int j0;
    public final boolean k0;

    public w(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.A = parcel.readString();
        this.B = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.L = z;
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.R = z2;
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readString();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.d0 = z3;
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.e0 = z4;
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f0 = z5;
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.g0 = z6;
        this.h0 = parcel.readInt();
        this.i0 = parcel.readString();
        this.j0 = parcel.readInt();
        this.k0 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.A);
        sb.append(" (");
        sb.append(this.B);
        sb.append(")}:");
        if (this.L) {
            sb.append(" fromLayout");
        }
        if (this.R) {
            sb.append(" dynamicContainer");
        }
        int i = this.Y;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.Z;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.d0) {
            sb.append(" retainInstance");
        }
        if (this.e0) {
            sb.append(" removing");
        }
        if (this.f0) {
            sb.append(" detached");
        }
        if (this.g0) {
            sb.append(" hidden");
        }
        String str2 = this.i0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.j0);
        }
        if (this.k0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.d0 ? 1 : 0);
        parcel.writeInt(this.e0 ? 1 : 0);
        parcel.writeInt(this.f0 ? 1 : 0);
        parcel.writeInt(this.g0 ? 1 : 0);
        parcel.writeInt(this.h0);
        parcel.writeString(this.i0);
        parcel.writeInt(this.j0);
        parcel.writeInt(this.k0 ? 1 : 0);
    }

    public w(o oVar) {
        this.A = oVar.getClass().getName();
        this.B = oVar.mWho;
        this.L = oVar.mFromLayout;
        this.R = oVar.mInDynamicContainer;
        this.X = oVar.mFragmentId;
        this.Y = oVar.mContainerId;
        this.Z = oVar.mTag;
        this.d0 = oVar.mRetainInstance;
        this.e0 = oVar.mRemoving;
        this.f0 = oVar.mDetached;
        this.g0 = oVar.mHidden;
        this.h0 = oVar.mMaxState.ordinal();
        this.i0 = oVar.mTargetWho;
        this.j0 = oVar.mTargetRequestCode;
        this.k0 = oVar.mUserVisibleHint;
    }
}
