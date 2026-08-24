package defpackage;

import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rk7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rk7 implements qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ rk7(int i) {
        this.A = i;
    }

    private final Object a(Object obj) {
        e36 e36Var = (e36) obj;
        e36Var.getClass();
        j36 i0 = e36Var.i0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        try {
            boolean z = false;
            if (i0.f0()) {
                if (((int) i0.getLong(0)) != 0) {
                    z = true;
                }
            }
            i0.close();
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            i0.close();
            throw th;
        }
    }

    private final Object b(Object obj) {
        boolean z;
        String R;
        int i;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        e36 e36Var = (e36) obj;
        e36Var.getClass();
        j36 i0 = e36Var.i0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            i0.c(1, 200L);
            int B = ej2.B(i0, "id");
            int B2 = ej2.B(i0, "state");
            int B3 = ej2.B(i0, "worker_class_name");
            int B4 = ej2.B(i0, "input_merger_class_name");
            int B5 = ej2.B(i0, "input");
            int B6 = ej2.B(i0, "output");
            int B7 = ej2.B(i0, "initial_delay");
            int B8 = ej2.B(i0, "interval_duration");
            int B9 = ej2.B(i0, "flex_duration");
            int B10 = ej2.B(i0, "run_attempt_count");
            int B11 = ej2.B(i0, "backoff_policy");
            int B12 = ej2.B(i0, "backoff_delay_duration");
            int B13 = ej2.B(i0, "last_enqueue_time");
            int B14 = ej2.B(i0, "minimum_retention_duration");
            int B15 = ej2.B(i0, "schedule_requested_at");
            int B16 = ej2.B(i0, "run_in_foreground");
            int B17 = ej2.B(i0, "out_of_quota_policy");
            int B18 = ej2.B(i0, "period_count");
            int B19 = ej2.B(i0, "generation");
            int B20 = ej2.B(i0, "next_schedule_time_override");
            int B21 = ej2.B(i0, "next_schedule_time_override_generation");
            int B22 = ej2.B(i0, "stop_reason");
            int B23 = ej2.B(i0, "trace_tag");
            int B24 = ej2.B(i0, "backoff_on_system_interruptions");
            int B25 = ej2.B(i0, "required_network_type");
            int B26 = ej2.B(i0, "required_network_request");
            int B27 = ej2.B(i0, "requires_charging");
            int B28 = ej2.B(i0, "requires_device_idle");
            int B29 = ej2.B(i0, "requires_battery_not_low");
            int B30 = ej2.B(i0, "requires_storage_not_low");
            int B31 = ej2.B(i0, "trigger_content_update_delay");
            int B32 = ej2.B(i0, "trigger_max_content_delay");
            int B33 = ej2.B(i0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (i0.f0()) {
                String R2 = i0.R(B);
                int i2 = B13;
                int i3 = B14;
                iw7 f = ds7.f((int) i0.getLong(B2));
                String R3 = i0.R(B3);
                String R4 = i0.R(B4);
                byte[] blob = i0.getBlob(B5);
                xb1 xb1Var = xb1.b;
                xb1 k = u24.k(blob);
                xb1 k2 = u24.k(i0.getBlob(B6));
                long j = i0.getLong(B7);
                long j2 = i0.getLong(B8);
                long j3 = i0.getLong(B9);
                int i4 = (int) i0.getLong(B10);
                int i5 = B;
                int i6 = B2;
                w10 c = ds7.c((int) i0.getLong(B11));
                long j4 = i0.getLong(B12);
                long j5 = i0.getLong(i2);
                long j6 = i0.getLong(i3);
                int i7 = B15;
                long j7 = i0.getLong(i7);
                B15 = i7;
                int i8 = B16;
                int i9 = B3;
                if (((int) i0.getLong(i8)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i10 = B17;
                int i11 = B4;
                oo4 e = ds7.e((int) i0.getLong(i10));
                int i12 = B18;
                int i13 = (int) i0.getLong(i12);
                int i14 = B19;
                int i15 = (int) i0.getLong(i14);
                int i16 = B20;
                long j8 = i0.getLong(i16);
                int i17 = B21;
                int i18 = (int) i0.getLong(i17);
                B21 = i17;
                int i19 = B22;
                int i20 = (int) i0.getLong(i19);
                int i21 = B23;
                Boolean bool = null;
                if (i0.isNull(i21)) {
                    R = null;
                } else {
                    R = i0.R(i21);
                }
                int i22 = B24;
                if (i0.isNull(i22)) {
                    i = i21;
                    B22 = i19;
                    valueOf = null;
                } else {
                    i = i21;
                    B22 = i19;
                    valueOf = Integer.valueOf((int) i0.getLong(i22));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                Boolean bool2 = bool;
                int i23 = B25;
                kf4 d = ds7.d((int) i0.getLong(i23));
                int i24 = B26;
                af4 h = ds7.h(i0.getBlob(i24));
                int i25 = B27;
                if (((int) i0.getLong(i25)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i26 = B28;
                if (((int) i0.getLong(i26)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i27 = B29;
                if (((int) i0.getLong(i27)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                B29 = i27;
                int i28 = B30;
                if (((int) i0.getLong(i28)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i29 = B31;
                int i30 = B32;
                B31 = i29;
                int i31 = B33;
                arrayList.add(new yw7(R2, f, R3, R4, k, k2, j, j2, j3, new p21(h, d, z2, z3, z4, z5, i0.getLong(i29), i0.getLong(i30), ds7.a(i0.getBlob(i31))), i4, c, j4, j5, j6, j7, z, e, i13, i15, j8, i18, i20, R, bool2));
                B28 = i26;
                B4 = i11;
                B17 = i10;
                B18 = i12;
                B19 = i14;
                B20 = i16;
                B23 = i;
                B24 = i22;
                B25 = i23;
                B26 = i24;
                B27 = i25;
                B33 = i31;
                B32 = i30;
                B30 = i28;
                B = i5;
                B3 = i9;
                B13 = i2;
                B14 = i3;
                B2 = i6;
                B16 = i8;
            }
            i0.close();
            return arrayList;
        } catch (Throwable th) {
            i0.close();
            throw th;
        }
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        j36 i0;
        boolean z;
        String R;
        Integer valueOf;
        Boolean bool;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String R2;
        Integer valueOf2;
        Boolean bool2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String R3;
        Integer valueOf3;
        Boolean bool3;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i = 0;
        switch (this.A) {
            case 0:
                zo zoVar = (zo) obj;
                return new of5(zoVar.a, zoVar.b, zoVar.c, zoVar.d);
            case 1:
                return Float.valueOf(((wo) obj).a);
            case 2:
                return Boolean.valueOf(jc2.y0((File) obj).equalsIgnoreCase("slangp"));
            case 3:
                hm4 hm4Var = (hm4) obj;
                hm4Var.getClass();
                return hm4Var.a;
            case 4:
                zq7 zq7Var = (zq7) obj;
                zq7Var.getClass();
                return zq7Var.a;
            case 5:
                no1 no1Var = (no1) obj;
                no1Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (no1Var.e() & 4294967295L)) / 24.0f;
                float f = intBitsToFloat * 18.0f;
                float f2 = intBitsToFloat * 11.0f;
                float f3 = 2.8f * intBitsToFloat;
                long floatToRawIntBits = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                bv3 l = d90.l(hf.c0(new kt0(hv.c(4278248959L)), new kt0(hv.c(4278216447L))), (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L) | (Float.floatToRawIntBits(RecyclerView.B1) << 32), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                float f4 = intBitsToFloat * 13.0f;
                bv3 l2 = d90.l(hf.c0(new kt0(hv.c(4278216447L)), new kt0(hv.c(4286262463L))), (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat * 24.0f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                no1.E0(no1Var, l, 0L, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), floatToRawIntBits, null, 240);
                no1.E0(no1Var, l2, (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), floatToRawIntBits, null, 240);
                hj a = lj.a();
                float f5 = 10.5f * intBitsToFloat;
                Path path = a.a;
                path.moveTo(f5, 1.5f * intBitsToFloat);
                float f6 = 11.5f * intBitsToFloat;
                a.e(5.5f * intBitsToFloat, f6);
                float f7 = 9.5f * intBitsToFloat;
                a.e(f7, f6);
                a.e(6.5f * intBitsToFloat, 22.5f * intBitsToFloat);
                a.e(13.5f * intBitsToFloat, f5);
                a.e(f7, f5);
                path.close();
                no1.B0(no1Var, a, kt0.d, RecyclerView.B1, null, 60);
                return jg7.a;
            case 6:
                ((Boolean) obj).getClass();
                return jg7.a;
            case 7:
                return ((dv7) obj).l;
            case 8:
                return ((dv7) obj).g;
            case 9:
                return ((dv7) obj).b;
            case 10:
                return ((dv7) obj).f;
            case 11:
                return ((dv7) obj).e;
            case 12:
                nv7 nv7Var = (nv7) obj;
                nv7Var.getClass();
                return nv7Var;
            case 13:
                k11 k11Var = (k11) obj;
                k11Var.getClass();
                return k11Var.getClass().getSimpleName();
            case 14:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                i0 = e36Var.i0("DELETE FROM WorkProgress");
                try {
                    i0.f0();
                    i0.close();
                    return jg7.a;
                } finally {
                }
            case 15:
                e36 e36Var2 = (e36) obj;
                e36Var2.getClass();
                i0 = e36Var2.i0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int B = ej2.B(i0, "id");
                    int B2 = ej2.B(i0, "state");
                    int B3 = ej2.B(i0, "worker_class_name");
                    int B4 = ej2.B(i0, "input_merger_class_name");
                    int B5 = ej2.B(i0, "input");
                    int B6 = ej2.B(i0, "output");
                    int B7 = ej2.B(i0, "initial_delay");
                    int B8 = ej2.B(i0, "interval_duration");
                    int B9 = ej2.B(i0, "flex_duration");
                    int B10 = ej2.B(i0, "run_attempt_count");
                    int B11 = ej2.B(i0, "backoff_policy");
                    int B12 = ej2.B(i0, "backoff_delay_duration");
                    int B13 = ej2.B(i0, "last_enqueue_time");
                    int B14 = ej2.B(i0, "minimum_retention_duration");
                    int B15 = ej2.B(i0, "schedule_requested_at");
                    int B16 = ej2.B(i0, "run_in_foreground");
                    int B17 = ej2.B(i0, "out_of_quota_policy");
                    int B18 = ej2.B(i0, "period_count");
                    int B19 = ej2.B(i0, "generation");
                    int B20 = ej2.B(i0, "next_schedule_time_override");
                    int B21 = ej2.B(i0, "next_schedule_time_override_generation");
                    int B22 = ej2.B(i0, "stop_reason");
                    int B23 = ej2.B(i0, "trace_tag");
                    int B24 = ej2.B(i0, "backoff_on_system_interruptions");
                    int B25 = ej2.B(i0, "required_network_type");
                    int B26 = ej2.B(i0, "required_network_request");
                    int B27 = ej2.B(i0, "requires_charging");
                    int B28 = ej2.B(i0, "requires_device_idle");
                    int B29 = ej2.B(i0, "requires_battery_not_low");
                    int B30 = ej2.B(i0, "requires_storage_not_low");
                    int B31 = ej2.B(i0, "trigger_content_update_delay");
                    int B32 = ej2.B(i0, "trigger_max_content_delay");
                    int B33 = ej2.B(i0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (i0.f0()) {
                        String R4 = i0.R(B);
                        int i2 = B14;
                        int i3 = B13;
                        iw7 f8 = ds7.f((int) i0.getLong(B2));
                        String R5 = i0.R(B3);
                        String R6 = i0.R(B4);
                        byte[] blob = i0.getBlob(B5);
                        xb1 xb1Var = xb1.b;
                        xb1 k = u24.k(blob);
                        xb1 k2 = u24.k(i0.getBlob(B6));
                        long j = i0.getLong(B7);
                        long j2 = i0.getLong(B8);
                        long j3 = i0.getLong(B9);
                        int i4 = (int) i0.getLong(B10);
                        int i5 = B5;
                        int i6 = B4;
                        w10 c = ds7.c((int) i0.getLong(B11));
                        long j4 = i0.getLong(B12);
                        long j5 = i0.getLong(i3);
                        long j6 = i0.getLong(i2);
                        int i7 = B15;
                        long j7 = i0.getLong(i7);
                        B15 = i7;
                        int i8 = B16;
                        int i9 = B3;
                        if (((int) i0.getLong(i8)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i10 = B17;
                        int i11 = B2;
                        oo4 e = ds7.e((int) i0.getLong(i10));
                        int i12 = B18;
                        int i13 = (int) i0.getLong(i12);
                        int i14 = B19;
                        int i15 = (int) i0.getLong(i14);
                        int i16 = B20;
                        long j8 = i0.getLong(i16);
                        int i17 = B21;
                        int i18 = (int) i0.getLong(i17);
                        B21 = i17;
                        int i19 = B22;
                        int i20 = (int) i0.getLong(i19);
                        int i21 = B23;
                        if (i0.isNull(i21)) {
                            R = null;
                        } else {
                            R = i0.R(i21);
                        }
                        int i22 = B24;
                        if (i0.isNull(i22)) {
                            B23 = i21;
                            B22 = i19;
                            valueOf = null;
                        } else {
                            B23 = i21;
                            B22 = i19;
                            valueOf = Integer.valueOf((int) i0.getLong(i22));
                        }
                        if (valueOf != null) {
                            if (valueOf.intValue() != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            bool = Boolean.valueOf(z6);
                        } else {
                            bool = null;
                        }
                        int i23 = B25;
                        kf4 d = ds7.d((int) i0.getLong(i23));
                        int i24 = B26;
                        af4 h = ds7.h(i0.getBlob(i24));
                        int i25 = B27;
                        if (((int) i0.getLong(i25)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i26 = B28;
                        if (((int) i0.getLong(i26)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i27 = B29;
                        if (((int) i0.getLong(i27)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        B29 = i27;
                        int i28 = B30;
                        if (((int) i0.getLong(i28)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i29 = B31;
                        int i30 = B32;
                        B31 = i29;
                        int i31 = B33;
                        arrayList.add(new yw7(R4, f8, R5, R6, k, k2, j, j2, j3, new p21(h, d, z2, z3, z4, z5, i0.getLong(i29), i0.getLong(i30), ds7.a(i0.getBlob(i31))), i4, c, j4, j5, j6, j7, z, e, i13, i15, j8, i18, i20, R, bool));
                        B28 = i26;
                        B2 = i11;
                        B17 = i10;
                        B18 = i12;
                        B19 = i14;
                        B20 = i16;
                        B24 = i22;
                        B25 = i23;
                        B26 = i24;
                        B27 = i25;
                        B33 = i31;
                        B32 = i30;
                        B30 = i28;
                        B4 = i6;
                        B13 = i3;
                        B14 = i2;
                        B5 = i5;
                        B3 = i9;
                        B16 = i8;
                    }
                    return arrayList;
                } finally {
                }
            case 16:
                e36 e36Var3 = (e36) obj;
                e36Var3.getClass();
                i0 = e36Var3.i0("SELECT * FROM workspec WHERE state=1");
                try {
                    int B34 = ej2.B(i0, "id");
                    int B35 = ej2.B(i0, "state");
                    int B36 = ej2.B(i0, "worker_class_name");
                    int B37 = ej2.B(i0, "input_merger_class_name");
                    int B38 = ej2.B(i0, "input");
                    int B39 = ej2.B(i0, "output");
                    int B40 = ej2.B(i0, "initial_delay");
                    int B41 = ej2.B(i0, "interval_duration");
                    int B42 = ej2.B(i0, "flex_duration");
                    int B43 = ej2.B(i0, "run_attempt_count");
                    int B44 = ej2.B(i0, "backoff_policy");
                    int B45 = ej2.B(i0, "backoff_delay_duration");
                    int B46 = ej2.B(i0, "last_enqueue_time");
                    int B47 = ej2.B(i0, "minimum_retention_duration");
                    int B48 = ej2.B(i0, "schedule_requested_at");
                    int B49 = ej2.B(i0, "run_in_foreground");
                    int B50 = ej2.B(i0, "out_of_quota_policy");
                    int B51 = ej2.B(i0, "period_count");
                    int B52 = ej2.B(i0, "generation");
                    int B53 = ej2.B(i0, "next_schedule_time_override");
                    int B54 = ej2.B(i0, "next_schedule_time_override_generation");
                    int B55 = ej2.B(i0, "stop_reason");
                    int B56 = ej2.B(i0, "trace_tag");
                    int B57 = ej2.B(i0, "backoff_on_system_interruptions");
                    int B58 = ej2.B(i0, "required_network_type");
                    int B59 = ej2.B(i0, "required_network_request");
                    int B60 = ej2.B(i0, "requires_charging");
                    int B61 = ej2.B(i0, "requires_device_idle");
                    int B62 = ej2.B(i0, "requires_battery_not_low");
                    int B63 = ej2.B(i0, "requires_storage_not_low");
                    int B64 = ej2.B(i0, "trigger_content_update_delay");
                    int B65 = ej2.B(i0, "trigger_max_content_delay");
                    int B66 = ej2.B(i0, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.f0()) {
                        String R7 = i0.R(B34);
                        int i32 = B47;
                        int i33 = B46;
                        iw7 f9 = ds7.f((int) i0.getLong(B35));
                        String R8 = i0.R(B36);
                        String R9 = i0.R(B37);
                        byte[] blob2 = i0.getBlob(B38);
                        xb1 xb1Var2 = xb1.b;
                        xb1 k3 = u24.k(blob2);
                        xb1 k4 = u24.k(i0.getBlob(B39));
                        long j9 = i0.getLong(B40);
                        long j10 = i0.getLong(B41);
                        long j11 = i0.getLong(B42);
                        int i34 = (int) i0.getLong(B43);
                        int i35 = B38;
                        int i36 = B37;
                        w10 c2 = ds7.c((int) i0.getLong(B44));
                        long j12 = i0.getLong(B45);
                        long j13 = i0.getLong(i33);
                        long j14 = i0.getLong(i32);
                        int i37 = B48;
                        long j15 = i0.getLong(i37);
                        int i38 = B36;
                        int i39 = B49;
                        if (((int) i0.getLong(i39)) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        int i40 = B35;
                        int i41 = B50;
                        oo4 e2 = ds7.e((int) i0.getLong(i41));
                        B50 = i41;
                        int i42 = B51;
                        int i43 = (int) i0.getLong(i42);
                        B51 = i42;
                        int i44 = B52;
                        int i45 = (int) i0.getLong(i44);
                        int i46 = B53;
                        long j16 = i0.getLong(i46);
                        int i47 = B54;
                        int i48 = (int) i0.getLong(i47);
                        B54 = i47;
                        int i49 = B55;
                        int i50 = (int) i0.getLong(i49);
                        int i51 = B56;
                        if (i0.isNull(i51)) {
                            R2 = null;
                        } else {
                            R2 = i0.R(i51);
                        }
                        int i52 = B57;
                        if (i0.isNull(i52)) {
                            B56 = i51;
                            B55 = i49;
                            valueOf2 = null;
                        } else {
                            B56 = i51;
                            B55 = i49;
                            valueOf2 = Integer.valueOf((int) i0.getLong(i52));
                        }
                        if (valueOf2 != null) {
                            if (valueOf2.intValue() != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bool2 = Boolean.valueOf(z12);
                        } else {
                            bool2 = null;
                        }
                        int i53 = B58;
                        kf4 d2 = ds7.d((int) i0.getLong(i53));
                        int i54 = B59;
                        af4 h2 = ds7.h(i0.getBlob(i54));
                        int i55 = B60;
                        if (((int) i0.getLong(i55)) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        int i56 = B61;
                        if (((int) i0.getLong(i56)) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i57 = B62;
                        if (((int) i0.getLong(i57)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        B62 = i57;
                        int i58 = B63;
                        if (((int) i0.getLong(i58)) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i59 = B64;
                        int i60 = B65;
                        B64 = i59;
                        int i61 = B66;
                        arrayList2.add(new yw7(R7, f9, R8, R9, k3, k4, j9, j10, j11, new p21(h2, d2, z8, z9, z10, z11, i0.getLong(i59), i0.getLong(i60), ds7.a(i0.getBlob(i61))), i34, c2, j12, j13, j14, j15, z7, e2, i43, i45, j16, i48, i50, R2, bool2));
                        B35 = i40;
                        B49 = i39;
                        B52 = i44;
                        B53 = i46;
                        B57 = i52;
                        B58 = i53;
                        B59 = i54;
                        B60 = i55;
                        B61 = i56;
                        B66 = i61;
                        B65 = i60;
                        B63 = i58;
                        B47 = i32;
                        B37 = i36;
                        B38 = i35;
                        B36 = i38;
                        B48 = i37;
                        B46 = i33;
                    }
                    return arrayList2;
                } finally {
                }
            case 17:
                e36 e36Var4 = (e36) obj;
                e36Var4.getClass();
                i0 = e36Var4.i0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int B67 = ej2.B(i0, "id");
                    int B68 = ej2.B(i0, "state");
                    int B69 = ej2.B(i0, "worker_class_name");
                    int B70 = ej2.B(i0, "input_merger_class_name");
                    int B71 = ej2.B(i0, "input");
                    int B72 = ej2.B(i0, "output");
                    int B73 = ej2.B(i0, "initial_delay");
                    int B74 = ej2.B(i0, "interval_duration");
                    int B75 = ej2.B(i0, "flex_duration");
                    int B76 = ej2.B(i0, "run_attempt_count");
                    int B77 = ej2.B(i0, "backoff_policy");
                    int B78 = ej2.B(i0, "backoff_delay_duration");
                    int B79 = ej2.B(i0, "last_enqueue_time");
                    int B80 = ej2.B(i0, "minimum_retention_duration");
                    int B81 = ej2.B(i0, "schedule_requested_at");
                    int B82 = ej2.B(i0, "run_in_foreground");
                    int B83 = ej2.B(i0, "out_of_quota_policy");
                    int B84 = ej2.B(i0, "period_count");
                    int B85 = ej2.B(i0, "generation");
                    int B86 = ej2.B(i0, "next_schedule_time_override");
                    int B87 = ej2.B(i0, "next_schedule_time_override_generation");
                    int B88 = ej2.B(i0, "stop_reason");
                    int B89 = ej2.B(i0, "trace_tag");
                    int B90 = ej2.B(i0, "backoff_on_system_interruptions");
                    int B91 = ej2.B(i0, "required_network_type");
                    int B92 = ej2.B(i0, "required_network_request");
                    int B93 = ej2.B(i0, "requires_charging");
                    int B94 = ej2.B(i0, "requires_device_idle");
                    int B95 = ej2.B(i0, "requires_battery_not_low");
                    int B96 = ej2.B(i0, "requires_storage_not_low");
                    int B97 = ej2.B(i0, "trigger_content_update_delay");
                    int B98 = ej2.B(i0, "trigger_max_content_delay");
                    int B99 = ej2.B(i0, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (i0.f0()) {
                        String R10 = i0.R(B67);
                        int i62 = B80;
                        int i63 = B79;
                        iw7 f10 = ds7.f((int) i0.getLong(B68));
                        String R11 = i0.R(B69);
                        String R12 = i0.R(B70);
                        byte[] blob3 = i0.getBlob(B71);
                        xb1 xb1Var3 = xb1.b;
                        xb1 k5 = u24.k(blob3);
                        xb1 k6 = u24.k(i0.getBlob(B72));
                        long j17 = i0.getLong(B73);
                        long j18 = i0.getLong(B74);
                        long j19 = i0.getLong(B75);
                        int i64 = (int) i0.getLong(B76);
                        int i65 = B71;
                        int i66 = B70;
                        w10 c3 = ds7.c((int) i0.getLong(B77));
                        long j20 = i0.getLong(B78);
                        long j21 = i0.getLong(i63);
                        long j22 = i0.getLong(i62);
                        int i67 = B81;
                        long j23 = i0.getLong(i67);
                        int i68 = B69;
                        int i69 = B82;
                        if (((int) i0.getLong(i69)) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i70 = B68;
                        int i71 = B83;
                        oo4 e3 = ds7.e((int) i0.getLong(i71));
                        B83 = i71;
                        int i72 = B84;
                        int i73 = (int) i0.getLong(i72);
                        B84 = i72;
                        int i74 = B85;
                        int i75 = (int) i0.getLong(i74);
                        int i76 = B86;
                        long j24 = i0.getLong(i76);
                        int i77 = B87;
                        int i78 = (int) i0.getLong(i77);
                        B87 = i77;
                        int i79 = B88;
                        int i80 = (int) i0.getLong(i79);
                        int i81 = B89;
                        if (i0.isNull(i81)) {
                            R3 = null;
                        } else {
                            R3 = i0.R(i81);
                        }
                        int i82 = B90;
                        if (i0.isNull(i82)) {
                            B89 = i81;
                            B88 = i79;
                            valueOf3 = null;
                        } else {
                            B89 = i81;
                            B88 = i79;
                            valueOf3 = Integer.valueOf((int) i0.getLong(i82));
                        }
                        if (valueOf3 != null) {
                            if (valueOf3.intValue() != 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            bool3 = Boolean.valueOf(z18);
                        } else {
                            bool3 = null;
                        }
                        int i83 = B91;
                        kf4 d3 = ds7.d((int) i0.getLong(i83));
                        int i84 = B92;
                        af4 h3 = ds7.h(i0.getBlob(i84));
                        int i85 = B93;
                        if (((int) i0.getLong(i85)) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        int i86 = B94;
                        if (((int) i0.getLong(i86)) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        int i87 = B95;
                        if (((int) i0.getLong(i87)) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        B95 = i87;
                        int i88 = B96;
                        if (((int) i0.getLong(i88)) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        int i89 = B97;
                        int i90 = B98;
                        B97 = i89;
                        int i91 = B99;
                        arrayList3.add(new yw7(R10, f10, R11, R12, k5, k6, j17, j18, j19, new p21(h3, d3, z14, z15, z16, z17, i0.getLong(i89), i0.getLong(i90), ds7.a(i0.getBlob(i91))), i64, c3, j20, j21, j22, j23, z13, e3, i73, i75, j24, i78, i80, R3, bool3));
                        B68 = i70;
                        B82 = i69;
                        B85 = i74;
                        B86 = i76;
                        B90 = i82;
                        B91 = i83;
                        B92 = i84;
                        B93 = i85;
                        B94 = i86;
                        B99 = i91;
                        B98 = i90;
                        B96 = i88;
                        B80 = i62;
                        B70 = i66;
                        B71 = i65;
                        B69 = i68;
                        B81 = i67;
                        B79 = i63;
                    }
                    return arrayList3;
                } finally {
                }
            case 18:
                e36 e36Var5 = (e36) obj;
                e36Var5.getClass();
                i0 = e36Var5.i0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    if (i0.f0()) {
                        i = (int) i0.getLong(0);
                    }
                    i0.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 19:
                return a(obj);
            case 20:
                return b(obj);
            default:
                e36 e36Var6 = (e36) obj;
                e36Var6.getClass();
                i0 = e36Var6.i0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    i0.f0();
                    int D = oi2.D(e36Var6);
                    i0.close();
                    return Integer.valueOf(D);
                } finally {
                }
        }
    }
}
