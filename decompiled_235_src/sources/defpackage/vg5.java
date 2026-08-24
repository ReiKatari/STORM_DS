package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vg5  reason: default package */
/* loaded from: classes.dex */
public final class vg5 implements Runnable {
    public int A;
    public int B;
    public OverScroller L;
    public Interpolator R;
    public boolean X;
    public boolean Y;
    public final /* synthetic */ RecyclerView Z;

    public vg5(RecyclerView recyclerView) {
        this.Z = recyclerView;
        tf5 tf5Var = RecyclerView.F1;
        this.R = tf5Var;
        this.X = false;
        this.Y = false;
        this.L = new OverScroller(recyclerView.getContext(), tf5Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.Z;
        recyclerView.setScrollState(2);
        this.B = 0;
        this.A = 0;
        Interpolator interpolator = this.R;
        tf5 tf5Var = RecyclerView.F1;
        if (interpolator != tf5Var) {
            this.R = tf5Var;
            this.L = new OverScroller(recyclerView.getContext(), tf5Var);
        }
        this.L.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.X) {
            this.Y = true;
            return;
        }
        RecyclerView recyclerView = this.Z;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = ao7.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        boolean z;
        int height;
        RecyclerView recyclerView = this.Z;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.F1;
        }
        if (this.R != interpolator) {
            this.R = interpolator;
            this.L = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.B = 0;
        this.A = 0;
        recyclerView.setScrollState(2);
        this.L.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        RecyclerView recyclerView = this.Z;
        int[] iArr = recyclerView.p1;
        if (recyclerView.m0 == null) {
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
            int i6 = currY - this.B;
            this.A = currX;
            this.B = currY;
            int o = RecyclerView.o(currX - this.A, recyclerView.H0, recyclerView.J0, recyclerView.getWidth());
            int o2 = RecyclerView.o(i6, recyclerView.I0, recyclerView.K0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.p1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(o, o2, 1, iArr2, null)) {
                o -= iArr[0];
                o2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o, o2);
            }
            if (recyclerView.l0 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.g0(o, o2, iArr);
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = o - i7;
                int i10 = o2 - i8;
                iv3 iv3Var = recyclerView.m0.e;
                if (iv3Var != null && !iv3Var.d && iv3Var.e) {
                    int b = recyclerView.d1.b();
                    if (b == 0) {
                        iv3Var.i();
                    } else if (iv3Var.a >= b) {
                        iv3Var.a = b - 1;
                        iv3Var.g(i7, i8);
                    } else {
                        iv3Var.g(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = o;
                i2 = o2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.o0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.p1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i3, i4, i, i2, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.x(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z = true;
            } else {
                z = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!overScroller.isFinished() && ((!z && i11 == 0) || (!z2 && i12 == 0))) {
                z3 = false;
            } else {
                z3 = true;
            }
            iv3 iv3Var2 = recyclerView.m0.e;
            if ((iv3Var2 == null || !iv3Var2.d) && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i11 < 0) {
                        i5 = -currVelocity;
                    } else if (i11 > 0) {
                        i5 = currVelocity;
                    } else {
                        i5 = 0;
                    }
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.z();
                        if (recyclerView.H0.isFinished()) {
                            recyclerView.H0.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.A();
                        if (recyclerView.J0.isFinished()) {
                            recyclerView.J0.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.I0.isFinished()) {
                            recyclerView.I0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.K0.isFinished()) {
                            recyclerView.K0.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.D1) {
                    ls0 ls0Var = recyclerView.c1;
                    int[] iArr4 = (int[]) ls0Var.e;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    ls0Var.d = 0;
                }
            } else {
                b();
                dr2 dr2Var = recyclerView.b1;
                if (dr2Var != null) {
                    dr2Var.a(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                zf5.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        iv3 iv3Var3 = recyclerView.m0.e;
        if (iv3Var3 != null && iv3Var3.d) {
            iv3Var3.g(0, 0);
        }
        this.X = false;
        if (this.Y) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = ao7.a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.o0(1);
    }
}
