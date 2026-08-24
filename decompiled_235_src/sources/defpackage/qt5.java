package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.junrar.unpack.vm.RarVM;
import java.util.UUID;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qt5  reason: default package */
/* loaded from: classes.dex */
public final class qt5 implements Parcelable {
    public static final pt5 CREATOR = new Object();
    public final jt5 A;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qt5(Parcel parcel) {
        UUID uuid;
        boolean z;
        u41 u41Var;
        Enum r11;
        Boolean bool;
        Boolean bool2;
        int readInt;
        Integer num;
        u26 u26Var = (u26) ((u52) u26.getEntries()).get(parcel.readInt());
        a36 a36Var = (a36) ((u52) a36.getEntries()).get(parcel.readInt());
        String readString = parcel.readString();
        if (readString != null) {
            uuid = UUID.fromString(readString);
        } else {
            uuid = null;
        }
        Parcelable H = xk2.H(parcel, zw5.class.getClassLoader(), zw5.class);
        H.getClass();
        hi2 hi2Var = ((zw5) H).A;
        String readString2 = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        nx5 nx5Var = (nx5) ((u52) nx5.getEntries()).get(parcel.readInt());
        z41 z41Var = (z41) xk2.H(parcel, z41.class.getClassLoader(), z41.class);
        if (z41Var != null) {
            u41Var = z41Var.A;
        } else {
            u41Var = null;
        }
        t52 entries = VideoRenderer.getEntries();
        int readInt2 = parcel.readInt();
        if (readInt2 >= 0) {
            r11 = (Enum) ((u52) entries).get(readInt2);
        } else {
            r11 = null;
        }
        VideoRenderer videoRenderer = (VideoRenderer) r11;
        int readInt3 = parcel.readInt();
        if (readInt3 != 0) {
            if (readInt3 != 1) {
                bool2 = null;
                readInt = parcel.readInt();
                if (readInt < 0) {
                    num = Integer.valueOf(readInt);
                } else {
                    num = null;
                }
                t52 entries2 = VideoFiltering.getEntries();
                int readInt4 = parcel.readInt();
                this.A = new jt5(u26Var, a36Var, uuid, hi2Var, readString2, z, nx5Var, u41Var, videoRenderer, bool2, num, (VideoFiltering) (readInt4 >= 0 ? (Enum) ((u52) entries2).get(readInt4) : null), parcel.readString(), parcel.readString(), RarVM.VM_GLOBALMEMADDR);
            }
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        bool2 = bool;
        readInt = parcel.readInt();
        if (readInt < 0) {
        }
        t52 entries22 = VideoFiltering.getEntries();
        int readInt42 = parcel.readInt();
        if (readInt42 >= 0) {
        }
        this.A = new jt5(u26Var, a36Var, uuid, hi2Var, readString2, z, nx5Var, u41Var, videoRenderer, bool2, num, (VideoFiltering) (readInt42 >= 0 ? (Enum) ((u52) entries22).get(readInt42) : null), parcel.readString(), parcel.readString(), RarVM.VM_GLOBALMEMADDR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2;
        int i3;
        parcel.getClass();
        jt5 jt5Var = this.A;
        parcel.writeInt(jt5Var.a.ordinal());
        parcel.writeInt(jt5Var.b.ordinal());
        UUID uuid = jt5Var.c;
        z41 z41Var = null;
        if (uuid != null) {
            str = uuid.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        int i4 = 0;
        parcel.writeParcelable(new zw5(jt5Var.d), 0);
        parcel.writeString(jt5Var.e);
        parcel.writeByte(jt5Var.f ? (byte) 1 : (byte) 0);
        parcel.writeInt(jt5Var.g.ordinal());
        u41 u41Var = jt5Var.h;
        if (u41Var != null) {
            z41Var = new z41(u41Var);
        }
        parcel.writeParcelable(z41Var, 0);
        VideoRenderer videoRenderer = jt5Var.i;
        int i5 = -1;
        if (videoRenderer != null) {
            i2 = videoRenderer.ordinal();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        Boolean bool = jt5Var.j;
        if (!nb3.k(bool, Boolean.FALSE)) {
            if (nb3.k(bool, Boolean.TRUE)) {
                i4 = 1;
            } else if (bool == null) {
                i4 = -1;
            } else {
                i.d();
                return;
            }
        }
        parcel.writeInt(i4);
        Integer num = jt5Var.k;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = -1;
        }
        parcel.writeInt(i3);
        VideoFiltering videoFiltering = jt5Var.l;
        if (videoFiltering != null) {
            i5 = videoFiltering.ordinal();
        }
        parcel.writeInt(i5);
        parcel.writeString(jt5Var.m);
        parcel.writeString(jt5Var.n);
    }

    public qt5(jt5 jt5Var) {
        jt5Var.getClass();
        this.A = jt5Var;
    }
}
