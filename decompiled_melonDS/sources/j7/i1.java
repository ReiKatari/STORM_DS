package j7;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 implements Runnable {
    public int A;
    public int B;
    public OverScroller L;
    public Interpolator R;
    public boolean X;
    public boolean Y;
    public final /* synthetic */ RecyclerView Z;

    public i1(RecyclerView recyclerView) {
        this.Z = recyclerView;
        j6.c cVar = RecyclerView.C1;
        this.R = cVar;
        this.X = false;
        this.Y = false;
        this.L = new OverScroller(recyclerView.getContext(), cVar);
    }

    public final void a(int i2, int i10) {
        RecyclerView recyclerView = this.Z;
        recyclerView.setScrollState(2);
        this.B = 0;
        this.A = 0;
        Interpolator interpolator = this.R;
        j6.c cVar = RecyclerView.C1;
        if (interpolator != cVar) {
            this.R = cVar;
            this.L = new OverScroller(recyclerView.getContext(), cVar);
        }
        this.L.fling(0, 0, i2, i10, Integer.MIN_VALUE, Preference.DEFAULT_ORDER, Integer.MIN_VALUE, Preference.DEFAULT_ORDER);
        b();
    }

    public final void b() {
        if (this.X) {
            this.Y = true;
            return;
        }
        RecyclerView recyclerView = this.Z;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = a6.x0.f533a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i2, int i10, int i11, Interpolator interpolator) {
        boolean z10;
        int height;
        RecyclerView recyclerView = this.Z;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i2);
            int abs2 = Math.abs(i10);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z10) {
                abs = abs2;
            }
            i11 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i12 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.C1;
        }
        if (this.R != interpolator) {
            this.R = interpolator;
            this.L = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.B = 0;
        this.A = 0;
        recyclerView.setScrollState(2);
        this.L.startScroll(0, 0, i2, i10, i12);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i10;
        int i11;
        int i12;
        boolean awakenScrollBars;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        RecyclerView recyclerView = this.Z;
        int[] iArr = recyclerView.f1645m1;
        if (recyclerView.f1640k0 == null) {
            recyclerView.removeCallbacks(this);
            this.L.abortAnimation();
            return;
        }
        this.Y = false;
        this.X = true;
        recyclerView.p();
        OverScroller overScroller = this.L;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currY - this.B;
            this.A = currX;
            this.B = currY;
            int o5 = RecyclerView.o(currX - this.A, recyclerView.E0, recyclerView.G0, recyclerView.getWidth());
            int o8 = RecyclerView.o(i14, recyclerView.F0, recyclerView.H0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f1645m1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.u(o5, o8, 1, iArr2, null)) {
                o5 -= iArr[0];
                o8 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o5, o8);
            }
            if (recyclerView.f1638j0 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.g0(o5, o8, iArr);
                int i15 = iArr[0];
                int i16 = iArr[1];
                int i17 = o5 - i15;
                int i18 = o8 - i16;
                c0 c0Var = recyclerView.f1640k0.f7712e;
                if (c0Var != null && !c0Var.f7510d && c0Var.f7511e) {
                    int b10 = recyclerView.f1621a1.b();
                    if (b10 == 0) {
                        c0Var.i();
                    } else if (c0Var.f7507a >= b10) {
                        c0Var.f7507a = b10 - 1;
                        c0Var.g(i15, i16);
                    } else {
                        c0Var.g(i15, i16);
                    }
                }
                i2 = i17;
                i11 = i15;
                i10 = i18;
                i12 = i16;
            } else {
                i2 = o5;
                i10 = o8;
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.f1644m0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1645m1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.v(i11, i12, i2, i10, null, 1, iArr3);
            int i19 = i2 - iArr[0];
            int i20 = i10 - iArr[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.w(i11, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!overScroller.isFinished() && ((!z10 && i19 == 0) || (!z11 && i20 == 0))) {
                z12 = false;
            } else {
                z12 = true;
            }
            c0 c0Var2 = recyclerView.f1640k0.f7712e;
            if ((c0Var2 == null || !c0Var2.f7510d) && z12) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i19 < 0) {
                        i13 = -currVelocity;
                    } else if (i19 > 0) {
                        i13 = currVelocity;
                    } else {
                        i13 = 0;
                    }
                    if (i20 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i20 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.y();
                        if (recyclerView.E0.isFinished()) {
                            recyclerView.E0.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.z();
                        if (recyclerView.G0.isFinished()) {
                            recyclerView.G0.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.F0.isFinished()) {
                            recyclerView.F0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.H0.isFinished()) {
                            recyclerView.H0.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.A1) {
                    f2.s sVar = recyclerView.Z0;
                    int[] iArr4 = (int[]) sVar.f4792e;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    sVar.f4791d = 0;
                }
            } else {
                b();
                v vVar = recyclerView.Y0;
                if (vVar != null) {
                    vVar.a(recyclerView, i11, i12);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                n0.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        c0 c0Var3 = recyclerView.f1640k0.f7712e;
        if (c0Var3 != null && c0Var3.f7510d) {
            c0Var3.g(0, 0);
        }
        this.X = false;
        if (this.Y) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = a6.x0.f533a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.o0(1);
    }
}
