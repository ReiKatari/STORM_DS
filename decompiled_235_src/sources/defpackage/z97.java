package defpackage;

import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z97  reason: default package */
/* loaded from: classes.dex */
public final class z97 extends la7 {
    public boolean b;
    public boolean c;
    public fo6 e;
    public final ei f;
    public Runnable g;
    public final /* synthetic */ qa7 h;
    public long a = -1;
    public int d = 0;

    public z97(qa7 qa7Var) {
        this.h = qa7Var;
        ei eiVar = new ei(10);
        long[] jArr = new long[20];
        eiVar.L = jArr;
        eiVar.R = new float[20];
        eiVar.B = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f = eiVar;
    }

    @Override // defpackage.la7, defpackage.da7
    public final void f(ea7 ea7Var) {
        this.c = true;
    }

    public final void g() {
        if (!this.b) {
            this.d = 1;
            this.g = null;
            return;
        }
        h();
        this.e.a((float) (this.h.t0 + 1));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [fe2, java.lang.Object] */
    public final void h() {
        char c;
        float f;
        int i;
        if (this.e == null) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            ei eiVar = this.f;
            int i2 = eiVar.B;
            float[] fArr = (float[]) eiVar.R;
            long[] jArr = (long[]) eiVar.L;
            char c2 = 20;
            int i3 = (i2 + 1) % 20;
            eiVar.B = i3;
            jArr[i3] = currentAnimationTimeMillis;
            fArr[i3] = (float) this.a;
            ?? obj = new Object();
            float f2 = RecyclerView.B1;
            obj.a = RecyclerView.B1;
            this.e = new fo6(obj);
            go6 go6Var = new go6();
            go6Var.a(1.0f);
            go6Var.b(200.0f);
            fo6 fo6Var = this.e;
            fo6Var.m = go6Var;
            fo6Var.b = (float) this.a;
            fo6Var.c = true;
            ArrayList arrayList = fo6Var.l;
            if (!fo6Var.f) {
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
                fo6 fo6Var2 = this.e;
                int i4 = eiVar.B;
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
                        int i6 = eiVar.B;
                        float f3 = 1000.0f;
                        if (i5 == 2) {
                            if (i6 == 0) {
                                i = 19;
                            } else {
                                i = i6 - 1;
                            }
                            float f4 = (float) (jArr[i6] - jArr[i]);
                            if (f4 != RecyclerView.B1) {
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
                fo6Var2.a = f2;
                fo6 fo6Var3 = this.e;
                fo6Var3.g = (float) (this.h.t0 + 1);
                fo6Var3.h = -1.0f;
                fo6Var3.j = 4.0f;
                y97 y97Var = new y97(this);
                ArrayList arrayList2 = fo6Var3.k;
                if (!arrayList2.contains(y97Var)) {
                    arrayList2.add(y97Var);
                    return;
                }
                return;
            }
            fa6.h("Error: Update listeners must be added beforethe animation.");
        }
    }
}
