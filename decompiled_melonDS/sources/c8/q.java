package c8;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends u {

    /* renamed from: b  reason: collision with root package name */
    public boolean f2681b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2682c;

    /* renamed from: e  reason: collision with root package name */
    public l6.f f2684e;

    /* renamed from: f  reason: collision with root package name */
    public final c0 f2685f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f2686g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ z f2687h;

    /* renamed from: a  reason: collision with root package name */
    public long f2680a = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2683d = 0;

    public q(z zVar) {
        this.f2687h = zVar;
        c0 c0Var = new c0(0);
        long[] jArr = new long[20];
        c0Var.f2625c = jArr;
        c0Var.f2626d = new float[20];
        c0Var.f2624b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f2685f = c0Var;
    }

    @Override // c8.u, c8.r
    public final void e(t tVar) {
        this.f2682c = true;
    }

    public final void g() {
        if (!this.f2681b) {
            this.f2683d = 1;
            this.f2686g = null;
            return;
        }
        h();
        this.f2684e.a((float) (this.f2687h.f2712r0 + 1));
    }

    public final void h() {
        char c4;
        float f8;
        int i2;
        if (this.f2684e == null) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            c0 c0Var = this.f2685f;
            int i10 = c0Var.f2624b;
            float[] fArr = (float[]) c0Var.f2626d;
            long[] jArr = (long[]) c0Var.f2625c;
            char c10 = 20;
            int i11 = (i10 + 1) % 20;
            c0Var.f2624b = i11;
            jArr[i11] = currentAnimationTimeMillis;
            fArr[i11] = (float) this.f2680a;
            l1.e eVar = new l1.e(4);
            float f10 = 0.0f;
            eVar.f8547b = 0.0f;
            this.f2684e = new l6.f(eVar);
            l6.g gVar = new l6.g();
            gVar.a(1.0f);
            gVar.b(200.0f);
            l6.f fVar = this.f2684e;
            fVar.m = gVar;
            fVar.f8945b = (float) this.f2680a;
            fVar.f8946c = true;
            ArrayList arrayList = fVar.f8955l;
            if (!fVar.f8949f) {
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
                l6.f fVar2 = this.f2684e;
                int i12 = c0Var.f2624b;
                long j2 = Long.MIN_VALUE;
                if (i12 != 0 || jArr[i12] != Long.MIN_VALUE) {
                    long j10 = jArr[i12];
                    int i13 = 0;
                    long j11 = j10;
                    while (true) {
                        long j12 = jArr[i12];
                        if (j12 != j2) {
                            float abs = (float) Math.abs(j12 - j11);
                            if (((float) (j10 - j12)) > 100.0f || abs > 40.0f) {
                                break;
                            }
                            if (i12 == 0) {
                                i12 = 20;
                            }
                            i12--;
                            i13++;
                            if (i13 >= 20) {
                                break;
                            }
                            j11 = j12;
                            j2 = Long.MIN_VALUE;
                        } else {
                            break;
                        }
                    }
                    if (i13 >= 2) {
                        int i14 = c0Var.f2624b;
                        float f11 = 1000.0f;
                        if (i13 == 2) {
                            if (i14 == 0) {
                                i2 = 19;
                            } else {
                                i2 = i14 - 1;
                            }
                            float f12 = (float) (jArr[i14] - jArr[i2]);
                            if (f12 != 0.0f) {
                                f10 = ((fArr[i14] - fArr[i2]) / f12) * 1000.0f;
                            }
                        } else {
                            int i15 = ((i14 - i13) + 21) % 20;
                            int i16 = (i14 + 21) % 20;
                            long j13 = jArr[i15];
                            float f13 = fArr[i15];
                            int i17 = i15 + 1;
                            int i18 = i17 % 20;
                            float f14 = 0.0f;
                            while (i18 != i16) {
                                long j14 = jArr[i18];
                                float f15 = f10;
                                int i19 = i16;
                                float f16 = (float) (j14 - j13);
                                if (f16 == f15) {
                                    c4 = c10;
                                    f8 = f11;
                                } else {
                                    float f17 = fArr[i18];
                                    c4 = c10;
                                    f8 = f11;
                                    float f18 = (f17 - f13) / f16;
                                    float abs2 = (Math.abs(f18) * (f18 - ((float) (Math.sqrt(2.0f * Math.abs(f14)) * Math.signum(f14))))) + f14;
                                    if (i18 == i17) {
                                        abs2 *= 0.5f;
                                    }
                                    f14 = abs2;
                                    f13 = f17;
                                    j13 = j14;
                                }
                                i18 = (i18 + 1) % 20;
                                f10 = f15;
                                i16 = i19;
                                c10 = c4;
                                f11 = f8;
                            }
                            f10 = ((float) (Math.sqrt(Math.abs(f14) * 2.0f) * Math.signum(f14))) * f11;
                        }
                    }
                }
                fVar2.f8944a = f10;
                l6.f fVar3 = this.f2684e;
                fVar3.f8950g = (float) (this.f2687h.f2712r0 + 1);
                fVar3.f8951h = -1.0f;
                fVar3.f8953j = 4.0f;
                p pVar = new p(this);
                ArrayList arrayList2 = fVar3.f8954k;
                if (!arrayList2.contains(pVar)) {
                    arrayList2.add(pVar);
                    return;
                }
                return;
            }
            m9.o.v("Error: Update listeners must be added beforethe animation.");
        }
    }
}
