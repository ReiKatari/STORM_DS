package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j03  reason: default package */
/* loaded from: classes.dex */
public final class j03 implements Parcelable.Creator {
    public static final e03 a(j03 j03Var, Parcel parcel) {
        j03Var.getClass();
        int readInt = parcel.readInt();
        Integer num = null;
        if (readInt != 1) {
            if (readInt != 2) {
                return d03.a;
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new b03(num, parcel.readInt(), (a03) ((f12) a03.getEntries()).get(parcel.readInt()));
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new c03(parcel.readInt(), num);
    }

    public static final void b(j03 j03Var, Parcel parcel, e03 e03Var) {
        j03Var.getClass();
        int i = 0;
        if (b53.x(e03Var, d03.a)) {
            parcel.writeInt(0);
        } else if (e03Var instanceof c03) {
            parcel.writeInt(1);
            c03 c03Var = (c03) e03Var;
            Integer num = c03Var.a;
            if (num != null) {
                i = 1;
            }
            parcel.writeInt(i);
            if (num != null) {
                parcel.writeInt(num.intValue());
            }
            parcel.writeInt(c03Var.b);
        } else if (e03Var instanceof b03) {
            parcel.writeInt(2);
            b03 b03Var = (b03) e03Var;
            Integer num2 = b03Var.a;
            if (num2 != null) {
                i = 1;
            }
            parcel.writeInt(i);
            if (num2 != null) {
                parcel.writeInt(num2.intValue());
            }
            parcel.writeInt(b03Var.b);
            parcel.writeInt(b03Var.c.ordinal());
        } else {
            i.c();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new k03(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new k03[i];
    }
}
