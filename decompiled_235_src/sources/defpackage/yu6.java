package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yu6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yu6 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ yu6(f47 f47Var, ep epVar, vm vmVar) {
        this.A = 5;
        this.B = epVar;
        this.L = vmVar;
    }

    @Override // defpackage.on2
    public final Object c() {
        CameraCharacteristics.Key key;
        String text;
        Intent intent;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        int i;
        long j;
        b47 d;
        jt3 jt3Var;
        fp fpVar;
        int i2 = this.A;
        int i3 = -1;
        boolean z = true;
        int i4 = 0;
        jg7 jg7Var = jg7.a;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i2) {
            case 0:
                List<jv6> list = (List) obj;
                xx xxVar = vr6.a;
                lg0 lg0Var = ((dv6) obj2).a;
                lg0Var.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                    key.getClass();
                    long[] jArr = (long[]) ((qc0) lg0Var).c(key);
                    if (jArr != null && jArr.length != 0) {
                        HashSet hashSet = new HashSet();
                        for (long j2 : jArr) {
                            hashSet.add(Long.valueOf(j2));
                        }
                        for (jv6 jv6Var : list) {
                            if (!hashSet.contains(Long.valueOf(jv6Var.c.getValue()))) {
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 1:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                text = textClassification.getText();
                if (text != null) {
                    i4 = text.hashCode();
                }
                intent = textClassification.getIntent();
                PendingIntent activity = PendingIntent.getActivity(context, i4, intent, 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                    }
                } else {
                    activity.send();
                }
                return jg7Var;
            case 2:
                hv.L((w61) obj2, null, a71.UNDISPATCHED, new v27(0, null, (qn2) obj), 1);
                return jg7Var;
            case 3:
                p27 p27Var = (p27) obj2;
                long j3 = ((q93) ((qa4) obj).getValue()).a;
                jk4 i5 = p27Var.i();
                long j4 = 9205357640488583168L;
                if (i5 != null) {
                    long j5 = i5.a;
                    fp m = p27Var.m();
                    if (m != null && m.B.length() != 0) {
                        fv2 fv2Var = (fv2) p27Var.r.getValue();
                        if (fv2Var == null) {
                            i = -1;
                        } else {
                            i = r27.a[fv2Var.ordinal()];
                        }
                        if (i != -1) {
                            if (i != 1 && i != 2) {
                                if (i == 3) {
                                    long j6 = p27Var.n().b;
                                    int i6 = k47.c;
                                    j = j6 & 4294967295L;
                                } else {
                                    i.d();
                                    return null;
                                }
                            } else {
                                long j7 = p27Var.n().b;
                                int i7 = k47.c;
                                j = j7 >> 32;
                            }
                            int i8 = (int) j;
                            jt3 jt3Var2 = p27Var.d;
                            if (jt3Var2 != null && (d = jt3Var2.d()) != null && (jt3Var = p27Var.d) != null && (fpVar = jt3Var.a.a) != null) {
                                int q = gi2.q(p27Var.b.s(i8), 0, fpVar.B.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d.d(j5) >> 32));
                                a47 a47Var = d.a;
                                v84 v84Var = a47Var.b;
                                int d2 = v84Var.d(q);
                                float e2 = a47Var.e(d2);
                                float f = a47Var.f(d2);
                                float p = gi2.p(intBitsToFloat, Math.min(e2, f), Math.max(e2, f));
                                if (q93.b(j3, 0L) || Math.abs(intBitsToFloat - p) <= ((int) (j3 >> 32)) / 2) {
                                    float f2 = v84Var.f(d2);
                                    j4 = (Float.floatToRawIntBits(p) << 32) | (Float.floatToRawIntBits(((v84Var.b(d2) - f2) / 2.0f) + f2) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new jk4(j4);
            case 4:
                ((on2) obj2).c();
                ((j37) obj).a();
                return jg7Var;
            case 5:
                vm vmVar = (vm) obj;
                pv3 pv3Var = (pv3) ((ep) obj2).a;
                if (pv3Var instanceof ov3) {
                    try {
                        String str = ((ov3) pv3Var).a;
                        vmVar.getClass();
                        try {
                            vmVar.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        } catch (ActivityNotFoundException e3) {
                            throw new IllegalArgumentException(i61.k('.', "Can't open ", str), e3);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return jg7Var;
            case 6:
                eo2 eo2Var = (eo2) obj2;
                qa4 qa4Var = (qa4) obj;
                t52<wa7> entries = wa7.getEntries();
                ArrayList arrayList = new ArrayList(ht0.v0(entries, 10));
                for (wa7 wa7Var : entries) {
                    arrayList.add(new vr4(wa7Var.getPreferenceValue(), qs6.Q0(wa7Var.getDisplayName(), " (")));
                }
                int size = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        Object obj3 = arrayList.get(i9);
                        i9++;
                        if (nb3.k(((vr4) obj3).A, (String) qa4Var.getValue())) {
                            i3 = i4;
                        } else {
                            i4++;
                        }
                    }
                }
                qa4Var.setValue((String) ((vr4) arrayList.get((i3 + 1) % arrayList.size())).A);
                eo2Var.o("translator_engine", (String) qa4Var.getValue());
                return jg7Var;
            case 7:
                ((gt7) ((j97) obj2).B).a((st7) obj);
                return jg7Var;
            default:
                ((gt7) ((j97) obj2).B).a((st7) obj);
                return jg7Var;
        }
    }

    public /* synthetic */ yu6(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
