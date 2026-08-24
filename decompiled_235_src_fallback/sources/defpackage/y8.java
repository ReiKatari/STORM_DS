package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y8  reason: default package */
/* loaded from: classes.dex */
public final class y8 implements android.os.Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ y8(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r10 = r10.a
            r0 = 0
            r1 = 0
            r2 = 1
            switch(r10) {
                case 0: goto L299;
                case 1: goto L289;
                case 2: goto L283;
                case 3: goto L27d;
                case 4: goto L268;
                case 5: goto L22e;
                case 6: goto L1fb;
                case 7: goto L1c7;
                case 8: goto L1bd;
                case 9: goto L1b3;
                case 10: goto L1ad;
                case 11: goto L19b;
                case 12: goto L14d;
                case 13: goto L147;
                case 14: goto L10a;
                case 15: goto Lde;
                case 16: goto Lc3;
                case 17: goto Lbd;
                case 18: goto La5;
                case 19: goto L79;
                case 20: goto L6c;
                case 21: goto L66;
                case 22: goto L5a;
                case 23: goto L54;
                case 24: goto L4a;
                case 25: goto L40;
                case 26: goto L36;
                case 27: goto L30;
                case 28: goto L2a;
                default: goto L8;
            }
        L8:
            r11.getClass()
            mx5 r3 = new mx5
            java.lang.String r4 = r11.readString()
            int r5 = r11.readInt()
            java.lang.String r6 = r11.readString()
            java.lang.String r7 = r11.readString()
            int r10 = r11.readInt()
            if (r10 == 0) goto L25
            r8 = r2
            goto L26
        L25:
            r8 = r1
        L26:
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L2a:
            r15 r10 = new r15
            r10.<init>(r11)
            return r10
        L30:
            v05 r10 = new v05
            r10.<init>(r11)
            return r10
        L36:
            ts4 r10 = new ts4
            long r0 = r11.readLong()
            r10.<init>(r0)
            return r10
        L40:
            ss4 r10 = new ss4
            int r11 = r11.readInt()
            r10.<init>(r11)
            return r10
        L4a:
            rs4 r10 = new rs4
            float r11 = r11.readFloat()
            r10.<init>(r11)
            return r10
        L54:
            androidx.versionedparcelable.ParcelImpl r10 = new androidx.versionedparcelable.ParcelImpl
            r10.<init>(r11)
            return r10
        L5a:
            ie4 r10 = new ie4
            r10.<init>(r11)
            int r11 = r11.readInt()
            r10.A = r11
            return r10
        L66:
            z84 r10 = new z84
            r10.<init>(r11)
            return r10
        L6c:
            int r10 = r11.readInt()
            int r11 = r11.readInt()
            i74 r10 = defpackage.i74.a(r10, r11)
            return r10
        L79:
            java.lang.String r10 = r11.readString()
            r10.getClass()
            int r0 = r11.readInt()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
        L89:
            if (r1 >= r0) goto L9f
            java.lang.String r3 = r11.readString()
            r3.getClass()
            java.lang.String r4 = r11.readString()
            r4.getClass()
            r2.put(r3, r4)
            int r1 = r1 + 1
            goto L89
        L9f:
            c44 r11 = new c44
            r11.<init>(r10, r2)
            return r11
        La5:
            h24 r10 = new h24
            r10.<init>(r11)
            java.lang.Class<h24> r0 = defpackage.h24.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r11 = r11.readValue(r0)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10.A = r11
            return r10
        Lbd:
            bx3 r10 = new bx3
            r10.<init>(r11)
            return r10
        Lc3:
            hv3 r10 = new hv3
            r10.<init>()
            int r0 = r11.readInt()
            r10.A = r0
            int r0 = r11.readInt()
            r10.B = r0
            int r11 = r11.readInt()
            if (r11 != r2) goto Ldb
            r1 = r2
        Ldb:
            r10.L = r1
            return r10
        Lde:
            r11.getClass()
            s93 r10 = new s93
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r11.readParcelable(r0)
            r0.getClass()
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r11.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r11.readInt()
            int r11 = r11.readInt()
            r10.<init>(r0, r1, r2, r11)
            return r10
        L10a:
            r11.getClass()
            int r10 = r11.readInt()
            if (r10 != 0) goto L115
        L113:
            r3 = r0
            goto L11e
        L115:
            long r2 = r11.readLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L113
        L11e:
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            java.lang.String r6 = r11.readString()
            int r10 = r11.readInt()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r10)
        L133:
            if (r1 == r10) goto L141
            android.os.Parcelable$Creator<dn0> r0 = defpackage.dn0.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r11)
            r7.add(r0)
            int r1 = r1 + 1
            goto L133
        L141:
            pp2 r2 = new pp2
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L147:
            androidx.fragment.app.w r10 = new androidx.fragment.app.w
            r10.<init>(r11)
            return r10
        L14d:
            ml2 r10 = new ml2
            r10.<init>()
            r10.X = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.Y = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.Z = r0
            java.util.ArrayList r0 = r11.createStringArrayList()
            r10.A = r0
            java.util.ArrayList r0 = r11.createStringArrayList()
            r10.B = r0
            android.os.Parcelable$Creator<androidx.fragment.app.b> r0 = androidx.fragment.app.b.CREATOR
            java.lang.Object[] r0 = r11.createTypedArray(r0)
            androidx.fragment.app.b[] r0 = (androidx.fragment.app.b[]) r0
            r10.L = r0
            int r0 = r11.readInt()
            r10.R = r0
            java.lang.String r0 = r11.readString()
            r10.X = r0
            java.util.ArrayList r0 = r11.createStringArrayList()
            r10.Y = r0
            android.os.Parcelable$Creator<l00> r0 = defpackage.l00.CREATOR
            java.util.ArrayList r0 = r11.createTypedArrayList(r0)
            r10.Z = r0
            android.os.Parcelable$Creator<il2> r0 = defpackage.il2.CREATOR
            java.util.ArrayList r11 = r11.createTypedArrayList(r0)
            r10.d0 = r11
            return r10
        L19b:
            il2 r10 = new il2
            r10.<init>()
            java.lang.String r0 = r11.readString()
            r10.A = r0
            int r11 = r11.readInt()
            r10.B = r11
            return r10
        L1ad:
            es1 r10 = new es1
            r10.<init>(r11)
            return r10
        L1b3:
            pe1 r10 = new pe1
            int r11 = r11.readInt()
            r10.<init>(r11)
            return r10
        L1bd:
            dc1 r10 = new dc1
            long r0 = r11.readLong()
            r10.<init>(r0)
            return r10
        L1c7:
            r11.getClass()
            r10 = r2
            ho0 r2 = new ho0
            int r3 = r11.readInt()
            if (r3 != 0) goto L1d5
        L1d3:
            r3 = r0
            goto L1de
        L1d5:
            long r3 = r11.readLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L1d3
        L1de:
            long r4 = r11.readLong()
            java.lang.String r6 = r11.readString()
            java.lang.String r7 = r11.readString()
            java.lang.String r8 = r11.readString()
            int r11 = r11.readInt()
            if (r11 == 0) goto L1f6
            r9 = r10
            goto L1f7
        L1f6:
            r9 = r1
        L1f7:
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r2
        L1fb:
            r11.getClass()
            int r10 = r11.readInt()
            if (r10 != 0) goto L205
            goto L20d
        L205:
            long r2 = r11.readLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L20d:
            java.lang.String r10 = r11.readString()
            int r2 = r11.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
        L21a:
            if (r1 == r2) goto L228
            android.os.Parcelable$Creator<ho0> r4 = defpackage.ho0.CREATOR
            java.lang.Object r4 = r4.createFromParcel(r11)
            r3.add(r4)
            int r1 = r1 + 1
            goto L21a
        L228:
            dn0 r11 = new dn0
            r11.<init>(r0, r10, r3)
            return r11
        L22e:
            java.lang.Class<i74> r10 = defpackage.i74.class
            java.lang.ClassLoader r0 = r10.getClassLoader()
            android.os.Parcelable r0 = r11.readParcelable(r0)
            r2 = r0
            i74 r2 = (defpackage.i74) r2
            java.lang.ClassLoader r0 = r10.getClassLoader()
            android.os.Parcelable r0 = r11.readParcelable(r0)
            r3 = r0
            i74 r3 = (defpackage.i74) r3
            java.lang.ClassLoader r10 = r10.getClassLoader()
            android.os.Parcelable r10 = r11.readParcelable(r10)
            r5 = r10
            i74 r5 = (defpackage.i74) r5
            java.lang.Class<dc1> r10 = defpackage.dc1.class
            java.lang.ClassLoader r10 = r10.getClassLoader()
            android.os.Parcelable r10 = r11.readParcelable(r10)
            r4 = r10
            dc1 r4 = (defpackage.dc1) r4
            int r6 = r11.readInt()
            fb0 r1 = new fb0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L268:
            r11.getClass()
            g10 r10 = new g10
            java.lang.String r0 = r11.readString()
            java.lang.String r1 = r11.readString()
            java.lang.String r11 = r11.readString()
            r10.<init>(r0, r1, r11)
            return r10
        L27d:
            l00 r10 = new l00
            r10.<init>(r11)
            return r10
        L283:
            androidx.fragment.app.b r10 = new androidx.fragment.app.b
            r10.<init>(r11)
            return r10
        L289:
            r10 = r2
            ds r0 = new ds
            r0.<init>(r11)
            byte r11 = r11.readByte()
            if (r11 == 0) goto L296
            r1 = r10
        L296:
            r0.A = r1
            return r0
        L299:
            r11.getClass()
            z8 r10 = new z8
            int r1 = r11.readInt()
            int r2 = r11.readInt()
            if (r2 != 0) goto L2a9
            goto L2b2
        L2a9:
            android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
            java.lang.Object r11 = r0.createFromParcel(r11)
            r0 = r11
            android.content.Intent r0 = (android.content.Intent) r0
        L2b2:
            r10.<init>(r0, r1)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L5c;
                case 1: goto L59;
                case 2: goto L56;
                case 3: goto L53;
                case 4: goto L50;
                case 5: goto L4d;
                case 6: goto L4a;
                case 7: goto L47;
                case 8: goto L44;
                case 9: goto L41;
                case 10: goto L3e;
                case 11: goto L3b;
                case 12: goto L38;
                case 13: goto L35;
                case 14: goto L32;
                case 15: goto L2f;
                case 16: goto L2c;
                case 17: goto L29;
                case 18: goto L26;
                case 19: goto L23;
                case 20: goto L20;
                case 21: goto L1d;
                case 22: goto L1a;
                case 23: goto L17;
                case 24: goto L14;
                case 25: goto L11;
                case 26: goto Le;
                case 27: goto Lb;
                case 28: goto L8;
                default: goto L5;
            }
        L5:
            mx5[] r0 = new defpackage.mx5[r1]
            return r0
        L8:
            r15[] r0 = new defpackage.r15[r1]
            return r0
        Lb:
            v05[] r0 = new defpackage.v05[r1]
            return r0
        Le:
            ts4[] r0 = new defpackage.ts4[r1]
            return r0
        L11:
            ss4[] r0 = new defpackage.ss4[r1]
            return r0
        L14:
            rs4[] r0 = new defpackage.rs4[r1]
            return r0
        L17:
            androidx.versionedparcelable.ParcelImpl[] r0 = new androidx.versionedparcelable.ParcelImpl[r1]
            return r0
        L1a:
            ie4[] r0 = new defpackage.ie4[r1]
            return r0
        L1d:
            z84[] r0 = new defpackage.z84[r1]
            return r0
        L20:
            i74[] r0 = new defpackage.i74[r1]
            return r0
        L23:
            c44[] r0 = new defpackage.c44[r1]
            return r0
        L26:
            h24[] r0 = new defpackage.h24[r1]
            return r0
        L29:
            bx3[] r0 = new defpackage.bx3[r1]
            return r0
        L2c:
            hv3[] r0 = new defpackage.hv3[r1]
            return r0
        L2f:
            s93[] r0 = new defpackage.s93[r1]
            return r0
        L32:
            pp2[] r0 = new defpackage.pp2[r1]
            return r0
        L35:
            androidx.fragment.app.w[] r0 = new androidx.fragment.app.w[r1]
            return r0
        L38:
            ml2[] r0 = new defpackage.ml2[r1]
            return r0
        L3b:
            il2[] r0 = new defpackage.il2[r1]
            return r0
        L3e:
            es1[] r0 = new defpackage.es1[r1]
            return r0
        L41:
            pe1[] r0 = new defpackage.pe1[r1]
            return r0
        L44:
            dc1[] r0 = new defpackage.dc1[r1]
            return r0
        L47:
            ho0[] r0 = new defpackage.ho0[r1]
            return r0
        L4a:
            dn0[] r0 = new defpackage.dn0[r1]
            return r0
        L4d:
            fb0[] r0 = new defpackage.fb0[r1]
            return r0
        L50:
            g10[] r0 = new defpackage.g10[r1]
            return r0
        L53:
            l00[] r0 = new defpackage.l00[r1]
            return r0
        L56:
            androidx.fragment.app.b[] r0 = new androidx.fragment.app.b[r1]
            return r0
        L59:
            ds[] r0 = new defpackage.ds[r1]
            return r0
        L5c:
            z8[] r0 = new defpackage.z8[r1]
            return r0
    }
}
