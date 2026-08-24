package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m63  reason: default package */
/* loaded from: classes.dex */
public final class m63 implements Parcelable.Creator {
    public static final h63 a(m63 m63Var, Parcel parcel) {
        m63Var.getClass();
        int readInt = parcel.readInt();
        Integer num = null;
        if (readInt != 1) {
            if (readInt != 2) {
                return g63.a;
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new e63(num, parcel.readInt(), (d63) ((u52) d63.getEntries()).get(parcel.readInt()));
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new f63(parcel.readInt(), num);
    }

    public static final void b(m63 m63Var, Parcel parcel, h63 h63Var) {
        m63Var.getClass();
        int i = 0;
        if (nb3.k(h63Var, g63.a)) {
            parcel.writeInt(0);
        } else if (h63Var instanceof f63) {
            parcel.writeInt(1);
            f63 f63Var = (f63) h63Var;
            Integer num = f63Var.a;
            if (num != null) {
                i = 1;
            }
            parcel.writeInt(i);
            if (num != null) {
                parcel.writeInt(num.intValue());
            }
            parcel.writeInt(f63Var.b);
        } else if (h63Var instanceof e63) {
            parcel.writeInt(2);
            e63 e63Var = (e63) h63Var;
            Integer num2 = e63Var.a;
            if (num2 != null) {
                i = 1;
            }
            parcel.writeInt(i);
            if (num2 != null) {
                parcel.writeInt(num2.intValue());
            }
            parcel.writeInt(e63Var.b);
            parcel.writeInt(e63Var.c.ordinal());
        } else {
            i.d();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new n63(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new n63[i];
    }
}
