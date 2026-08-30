package z2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.i0;
import j7.c1;
import me.magnum.melonds.common.camera.DSiCameraSource;
import q.k3;
import q.w2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14928a;

    public /* synthetic */ o(int i2) {
        this.f14928a = i2;
    }

    public static p a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = o.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new p();
        }
        r2.f e6 = r2.i.B.e();
        for (int i2 = 0; i2 < readInt; i2++) {
            e6.add(parcel.readValue(classLoader));
        }
        return new p(e6.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14928a) {
            case 0:
                return a(parcel, null);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new i0(parcel, null);
            case 2:
                return new ha.a(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return i6.b.B;
                }
                a0.j.p("superState must be null");
                return null;
            case 4:
                return new c1(parcel, null);
            case l1.c.f8511g /* 5 */:
                return new k5.f(parcel, null);
            case l1.c.f8509e /* 6 */:
                return new oa.d(parcel, null);
            case 7:
                return new w2(parcel, null);
            case 8:
                return new k3(parcel, null);
            case l1.c.f8508d /* 9 */:
                return new qa.y(parcel, null);
            case l1.c.f8510f /* 10 */:
                return new y9.a(parcel, null);
            default:
                return new z9.c(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f14928a) {
            case 0:
                return new p[i2];
            case DSiCameraSource.FrontCamera /* 1 */:
                return new i0[i2];
            case 2:
                return new ha.a[i2];
            case 3:
                return new i6.b[i2];
            case 4:
                return new c1[i2];
            case l1.c.f8511g /* 5 */:
                return new k5.f[i2];
            case l1.c.f8509e /* 6 */:
                return new oa.d[i2];
            case 7:
                return new w2[i2];
            case 8:
                return new k3[i2];
            case l1.c.f8508d /* 9 */:
                return new qa.y[i2];
            case l1.c.f8510f /* 10 */:
                return new y9.a[i2];
            default:
                return new z9.c[i2];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f14928a) {
            case 0:
                return a(parcel, classLoader);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new i0(parcel, classLoader);
            case 2:
                return new ha.a(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return i6.b.B;
                }
                a0.j.p("superState must be null");
                return null;
            case 4:
                return new c1(parcel, classLoader);
            case l1.c.f8511g /* 5 */:
                return new k5.f(parcel, classLoader);
            case l1.c.f8509e /* 6 */:
                return new oa.d(parcel, classLoader);
            case 7:
                return new w2(parcel, classLoader);
            case 8:
                return new k3(parcel, classLoader);
            case l1.c.f8508d /* 9 */:
                return new qa.y(parcel, classLoader);
            case l1.c.f8510f /* 10 */:
                return new y9.a(parcel, classLoader);
            default:
                return new z9.c(parcel, classLoader);
        }
    }
}
