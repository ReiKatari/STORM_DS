package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m1 implements Parcelable {
    public static final Parcelable.Creator<m1> CREATOR = new a8.l(5);
    public final String A;
    public final String B;
    public final boolean L;
    public final boolean R;
    public final int X;
    public final int Y;
    public final String Z;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f1357b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f1358c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f1359d0;

    /* renamed from: e0  reason: collision with root package name */
    public final boolean f1360e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f1361f0;

    /* renamed from: g0  reason: collision with root package name */
    public final String f1362g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f1363h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f1364i0;

    public m1(Parcel parcel) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.A = parcel.readString();
        this.B = parcel.readString();
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L = z10;
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.R = z11;
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readString();
        if (parcel.readInt() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f1357b0 = z12;
        if (parcel.readInt() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f1358c0 = z13;
        if (parcel.readInt() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f1359d0 = z14;
        if (parcel.readInt() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f1360e0 = z15;
        this.f1361f0 = parcel.readInt();
        this.f1362g0 = parcel.readString();
        this.f1363h0 = parcel.readInt();
        this.f1364i0 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.A);
        sb2.append(" (");
        sb2.append(this.B);
        sb2.append(")}:");
        if (this.L) {
            sb2.append(" fromLayout");
        }
        if (this.R) {
            sb2.append(" dynamicContainer");
        }
        int i2 = this.Y;
        if (i2 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i2));
        }
        String str = this.Z;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f1357b0) {
            sb2.append(" retainInstance");
        }
        if (this.f1358c0) {
            sb2.append(" removing");
        }
        if (this.f1359d0) {
            sb2.append(" detached");
        }
        if (this.f1360e0) {
            sb2.append(" hidden");
        }
        String str2 = this.f1362g0;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f1363h0);
        }
        if (this.f1364i0) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.f1357b0 ? 1 : 0);
        parcel.writeInt(this.f1358c0 ? 1 : 0);
        parcel.writeInt(this.f1359d0 ? 1 : 0);
        parcel.writeInt(this.f1360e0 ? 1 : 0);
        parcel.writeInt(this.f1361f0);
        parcel.writeString(this.f1362g0);
        parcel.writeInt(this.f1363h0);
        parcel.writeInt(this.f1364i0 ? 1 : 0);
    }

    public m1(j0 j0Var) {
        this.A = j0Var.getClass().getName();
        this.B = j0Var.mWho;
        this.L = j0Var.mFromLayout;
        this.R = j0Var.mInDynamicContainer;
        this.X = j0Var.mFragmentId;
        this.Y = j0Var.mContainerId;
        this.Z = j0Var.mTag;
        this.f1357b0 = j0Var.mRetainInstance;
        this.f1358c0 = j0Var.mRemoving;
        this.f1359d0 = j0Var.mDetached;
        this.f1360e0 = j0Var.mHidden;
        this.f1361f0 = j0Var.mMaxState.ordinal();
        this.f1362g0 = j0Var.mTargetWho;
        this.f1363h0 = j0Var.mTargetRequestCode;
        this.f1364i0 = j0Var.mUserVisibleHint;
    }
}
