package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bj5  reason: default package */
/* loaded from: classes.dex */
public final class bj5 implements Parcelable {
    public static final aj5 CREATOR = new Object();
    public final ti5 A;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bj5(android.os.Parcel r19) {
        /*
            r18 = this;
            r0 = r19
            r18.<init>()
            e12 r1 = defpackage.cs5.getEntries()
            int r2 = r0.readInt()
            f12 r1 = (defpackage.f12) r1
            java.lang.Object r1 = r1.get(r2)
            r3 = r1
            cs5 r3 = (defpackage.cs5) r3
            e12 r1 = defpackage.is5.getEntries()
            int r2 = r0.readInt()
            f12 r1 = (defpackage.f12) r1
            java.lang.Object r1 = r1.get(r2)
            r4 = r1
            is5 r4 = (defpackage.is5) r4
            java.lang.String r1 = r0.readString()
            r2 = 0
            if (r1 == 0) goto L34
            java.util.UUID r1 = java.util.UUID.fromString(r1)
            r5 = r1
            goto L35
        L34:
            r5 = r2
        L35:
            java.lang.Class<km5> r1 = defpackage.km5.class
            java.lang.ClassLoader r6 = r1.getClassLoader()
            android.os.Parcelable r1 = defpackage.hi2.Q(r0, r6, r1)
            r1.getClass()
            km5 r1 = (defpackage.km5) r1
            me2 r6 = r1.A
            java.lang.String r7 = r0.readString()
            byte r1 = r0.readByte()
            r8 = 1
            if (r1 == 0) goto L53
            r1 = r8
            goto L54
        L53:
            r1 = 0
        L54:
            e12 r9 = defpackage.ym5.getEntries()
            int r10 = r0.readInt()
            f12 r9 = (defpackage.f12) r9
            java.lang.Object r9 = r9.get(r10)
            ym5 r9 = (defpackage.ym5) r9
            java.lang.Class<r11> r10 = defpackage.r11.class
            java.lang.ClassLoader r11 = r10.getClassLoader()
            android.os.Parcelable r10 = defpackage.hi2.Q(r0, r11, r10)
            r11 r10 = (defpackage.r11) r10
            if (r10 == 0) goto L75
            m11 r10 = r10.A
            goto L76
        L75:
            r10 = r2
        L76:
            e12 r11 = me.magnum.melonds.domain.model.VideoRenderer.getEntries()
            int r12 = r0.readInt()
            if (r12 < 0) goto L89
            f12 r11 = (defpackage.f12) r11
            java.lang.Object r11 = r11.get(r12)
            java.lang.Enum r11 = (java.lang.Enum) r11
            goto L8a
        L89:
            r11 = r2
        L8a:
            me.magnum.melonds.domain.model.VideoRenderer r11 = (me.magnum.melonds.domain.model.VideoRenderer) r11
            int r12 = r0.readInt()
            if (r12 == 0) goto L9a
            if (r12 == r8) goto L96
            r12 = r2
            goto L9d
        L96:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
        L98:
            r12 = r8
            goto L9d
        L9a:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L98
        L9d:
            int r8 = r0.readInt()
            if (r8 < 0) goto La9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13 = r8
            goto Laa
        La9:
            r13 = r2
        Laa:
            e12 r8 = me.magnum.melonds.domain.model.VideoFiltering.getEntries()
            int r14 = r0.readInt()
            if (r14 < 0) goto Lbc
            f12 r8 = (defpackage.f12) r8
            java.lang.Object r2 = r8.get(r14)
            java.lang.Enum r2 = (java.lang.Enum) r2
        Lbc:
            r14 = r2
            me.magnum.melonds.domain.model.VideoFiltering r14 = (me.magnum.melonds.domain.model.VideoFiltering) r14
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            ti5 r2 = new ti5
            r17 = 16384(0x4000, float:2.2959E-41)
            r8 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r18
            r0.A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj5.<init>(android.os.Parcel):void");
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
        ti5 ti5Var = this.A;
        parcel.writeInt(ti5Var.a.ordinal());
        parcel.writeInt(ti5Var.b.ordinal());
        UUID uuid = ti5Var.c;
        r11 r11Var = null;
        if (uuid != null) {
            str = uuid.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        int i4 = 0;
        parcel.writeParcelable(new km5(ti5Var.d), 0);
        parcel.writeString(ti5Var.e);
        parcel.writeByte(ti5Var.f ? (byte) 1 : (byte) 0);
        parcel.writeInt(ti5Var.g.ordinal());
        m11 m11Var = ti5Var.h;
        if (m11Var != null) {
            r11Var = new r11(m11Var);
        }
        parcel.writeParcelable(r11Var, 0);
        VideoRenderer videoRenderer = ti5Var.i;
        int i5 = -1;
        if (videoRenderer != null) {
            i2 = videoRenderer.ordinal();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        Boolean bool = ti5Var.j;
        if (!b53.x(bool, Boolean.FALSE)) {
            if (b53.x(bool, Boolean.TRUE)) {
                i4 = 1;
            } else if (bool == null) {
                i4 = -1;
            } else {
                i.c();
                return;
            }
        }
        parcel.writeInt(i4);
        Integer num = ti5Var.k;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = -1;
        }
        parcel.writeInt(i3);
        VideoFiltering videoFiltering = ti5Var.l;
        if (videoFiltering != null) {
            i5 = videoFiltering.ordinal();
        }
        parcel.writeInt(i5);
        parcel.writeString(ti5Var.m);
        parcel.writeString(ti5Var.n);
    }

    public bj5(ti5 ti5Var) {
        ti5Var.getClass();
        this.A = ti5Var;
    }
}
