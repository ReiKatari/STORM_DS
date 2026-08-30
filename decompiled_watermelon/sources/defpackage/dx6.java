package defpackage;

import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dx6  reason: default package */
/* loaded from: classes.dex */
public final class dx6 extends ox6 {
    public boolean b;
    public boolean c;
    public pc6 e;
    public final sh f;
    public Runnable g;
    public final /* synthetic */ tx6 h;
    public long a = -1;
    public int d = 0;

    public dx6(tx6 tx6Var) {
        this.h = tx6Var;
        sh shVar = new sh(9);
        long[] jArr = new long[20];
        shVar.c = jArr;
        shVar.d = new float[20];
        shVar.b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f = shVar;
    }

    @Override // defpackage.ox6, defpackage.hx6
    public final void e(ix6 ix6Var) {
        this.c = true;
    }

    public final void g() {
        if (!this.b) {
            this.d = 1;
            this.g = null;
            return;
        }
        h();
        this.e.a((float) (this.h.s0 + 1));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [n92, java.lang.Object] */
    public final void h() {
        char c;
        float f;
        int i;
        if (this.e == null) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            sh shVar = this.f;
            int i2 = shVar.b;
            float[] fArr = (float[]) shVar.d;
            long[] jArr = (long[]) shVar.c;
            char c2 = 20;
            int i3 = (i2 + 1) % 20;
            shVar.b = i3;
            jArr[i3] = currentAnimationTimeMillis;
            fArr[i3] = (float) this.a;
            ?? obj = new Object();
            float f2 = RecyclerView.A1;
            obj.a = RecyclerView.A1;
            this.e = new pc6(obj);
            qc6 qc6Var = new qc6();
            qc6Var.a(1.0f);
            qc6Var.b(200.0f);
            pc6 pc6Var = this.e;
            pc6Var.m = qc6Var;
            pc6Var.b = (float) this.a;
            pc6Var.c = true;
            ArrayList arrayList = pc6Var.l;
            if (!pc6Var.f) {
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
                pc6 pc6Var2 = this.e;
                int i4 = shVar.b;
                long j = Long.MIN_VALUE;
                if (i4 != 0 || jArr[i4] != Long.MIN_VALUE) {
                    long j2 = jArr[i4];
                    int i5 = 0;
                    long j3 = j2;
                    while (true) {
                        long j4 = jArr[i4];
                        if (j4 != j) {
                            float abs = (float) Math.abs(j4 - j3);
                            if (((float) (j2 - j4)) > 100.0f || abs > 40.0f) {
                                break;
                            }
                            if (i4 == 0) {
                                i4 = 20;
                            }
                            i4--;
                            i5++;
                            if (i5 >= 20) {
                                break;
                            }
                            j3 = j4;
                            j = Long.MIN_VALUE;
                        } else {
                            break;
                        }
                    }
                    if (i5 >= 2) {
                        int i6 = shVar.b;
                        float f3 = 1000.0f;
                        if (i5 == 2) {
                            if (i6 == 0) {
                                i = 19;
                            } else {
                                i = i6 - 1;
                            }
                            float f4 = (float) (jArr[i6] - jArr[i]);
                            if (f4 != RecyclerView.A1) {
                                f2 = ((fArr[i6] - fArr[i]) / f4) * 1000.0f;
                            }
                        } else {
                            int i7 = ((i6 - i5) + 21) % 20;
                            int i8 = (i6 + 21) % 20;
                            long j5 = jArr[i7];
                            float f5 = fArr[i7];
                            int i9 = i7 + 1;
                            int i10 = i9 % 20;
                            float f6 = 0.0f;
                            while (i10 != i8) {
                                long j6 = jArr[i10];
                                float f7 = f2;
                                int i11 = i8;
                                float f8 = (float) (j6 - j5);
                                if (f8 == f7) {
                                    c = c2;
                                    f = f3;
                                } else {
                                    float f9 = fArr[i10];
                                    c = c2;
                                    f = f3;
                                    float f10 = (f9 - f5) / f8;
                                    float abs2 = (Math.abs(f10) * (f10 - ((float) (Math.sqrt(2.0f * Math.abs(f6)) * Math.signum(f6))))) + f6;
                                    if (i10 == i9) {
                                        abs2 *= 0.5f;
                                    }
                                    f6 = abs2;
                                    f5 = f9;
                                    j5 = j6;
                                }
                                i10 = (i10 + 1) % 20;
                                f2 = f7;
                                i8 = i11;
                                c2 = c;
                                f3 = f;
                            }
                            f2 = ((float) (Math.sqrt(Math.abs(f6) * 2.0f) * Math.signum(f6))) * f3;
                        }
                    }
                }
                pc6Var2.a = f2;
                pc6 pc6Var3 = this.e;
                pc6Var3.g = (float) (this.h.s0 + 1);
                pc6Var3.h = -1.0f;
                pc6Var3.j = 4.0f;
                cx6 cx6Var = new cx6(this);
                ArrayList arrayList2 = pc6Var3.k;
                if (!arrayList2.contains(cx6Var)) {
                    arrayList2.add(cx6Var);
                    return;
                }
                return;
            }
            vd6.i("Error: Update listeners must be added beforethe animation.");
        }
    }
}
