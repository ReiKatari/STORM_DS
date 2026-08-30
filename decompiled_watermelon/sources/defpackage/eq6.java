package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eq6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eq6 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ eq6(qr6 qr6Var, so soVar, jm jmVar) {
        this.A = 2;
        this.B = soVar;
        this.L = jmVar;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i;
        long j;
        mr6 d;
        hm3 hm3Var;
        to toVar;
        int i2 = this.A;
        o27 o27Var = o27.a;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i2) {
            case 0:
                bq6 bq6Var = (bq6) obj2;
                long j2 = ((i33) ((k24) obj).getValue()).a;
                mb4 i3 = bq6Var.i();
                long j3 = 9205357640488583168L;
                if (i3 != null) {
                    long j4 = i3.a;
                    to m = bq6Var.m();
                    if (m != null && m.B.length() != 0) {
                        dp2 dp2Var = (dp2) bq6Var.r.getValue();
                        if (dp2Var == null) {
                            i = -1;
                        } else {
                            i = dq6.a[dp2Var.ordinal()];
                        }
                        if (i != -1) {
                            if (i != 1 && i != 2) {
                                if (i == 3) {
                                    long j5 = bq6Var.n().b;
                                    int i4 = vr6.c;
                                    j = j5 & 4294967295L;
                                } else {
                                    i.c();
                                    return null;
                                }
                            } else {
                                long j6 = bq6Var.n().b;
                                int i5 = vr6.c;
                                j = j6 >> 32;
                            }
                            int i6 = (int) j;
                            hm3 hm3Var2 = bq6Var.d;
                            if (hm3Var2 != null && (d = hm3Var2.d()) != null && (hm3Var = bq6Var.d) != null && (toVar = hm3Var.a.a) != null) {
                                int m2 = io2.m(bq6Var.b.r(i6), 0, toVar.B.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d.d(j4) >> 32));
                                lr6 lr6Var = d.a;
                                q04 q04Var = lr6Var.b;
                                int d2 = q04Var.d(m2);
                                float e = lr6Var.e(d2);
                                float f = lr6Var.f(d2);
                                float l = io2.l(intBitsToFloat, Math.min(e, f), Math.max(e, f));
                                if (i33.b(j2, 0L) || Math.abs(intBitsToFloat - l) <= ((int) (j2 >> 32)) / 2) {
                                    float f2 = q04Var.f(d2);
                                    j3 = (Float.floatToRawIntBits(l) << 32) | (Float.floatToRawIntBits(((q04Var.b(d2) - f2) / 2.0f) + f2) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new mb4(j3);
            case 1:
                ((ki2) obj2).c();
                ((uq6) obj).a();
                return o27Var;
            case 2:
                jm jmVar = (jm) obj;
                no3 no3Var = (no3) ((so) obj2).a;
                if (no3Var instanceof mo3) {
                    try {
                        String str = ((mo3) no3Var).a;
                        jmVar.getClass();
                        try {
                            jmVar.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        } catch (ActivityNotFoundException e2) {
                            throw new IllegalArgumentException(b31.n('.', "Can't open ", str), e2);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return o27Var;
            case 3:
                ((ee7) ((u57) obj2).B).a((qe7) obj);
                return o27Var;
            default:
                ((ee7) ((u57) obj2).B).a((qe7) obj);
                return o27Var;
        }
    }

    public /* synthetic */ eq6(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
