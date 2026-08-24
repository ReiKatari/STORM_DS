package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: is  reason: default package */
/* loaded from: classes.dex */
public final class is implements Runnable {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public is(pw3 pw3Var, int i, gx3 gx3Var) {
        this.R = pw3Var;
        this.B = i;
        this.L = gx3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qb0 qb0Var;
        ArrayList arrayList;
        int decrementAndGet;
        int i = this.A;
        boolean z = false;
        Object obj = this.L;
        int i2 = this.B;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                ((TextView) obj).setTypeface((Typeface) obj2, i2);
                return;
            case 1:
                ((BottomSheetBehavior) obj2).L((View) obj, i2, false);
                return;
            default:
                pw3 pw3Var = (pw3) obj2;
                gx3 gx3Var = (gx3) obj;
                boolean z2 = pw3Var.L;
                AtomicInteger atomicInteger = pw3Var.R;
                ArrayList arrayList2 = pw3Var.B;
                gx3 gx3Var2 = pw3Var.X;
                if (!gx3Var2.isDone() && arrayList2 != null) {
                    try {
                        try {
                            try {
                                try {
                                    np2.A("Tried to set value from future which is not done", gx3Var.isDone());
                                    arrayList2.set(i2, l.w(gx3Var));
                                    decrementAndGet = atomicInteger.decrementAndGet();
                                    if (decrementAndGet >= 0) {
                                        z = true;
                                    }
                                    np2.A("Less than 0 remaining futures", z);
                                } catch (CancellationException unused) {
                                    if (z2) {
                                        pw3Var.cancel(false);
                                    }
                                    int decrementAndGet2 = atomicInteger.decrementAndGet();
                                    if (decrementAndGet2 >= 0) {
                                        z = true;
                                    }
                                    np2.A("Less than 0 remaining futures", z);
                                    if (decrementAndGet2 == 0) {
                                        ArrayList arrayList3 = pw3Var.B;
                                        if (arrayList3 != null) {
                                            qb0Var = pw3Var.Y;
                                            arrayList = new ArrayList(arrayList3);
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            } catch (ExecutionException e) {
                                if (z2) {
                                    pw3Var.Y.c(e.getCause());
                                }
                                int decrementAndGet3 = atomicInteger.decrementAndGet();
                                if (decrementAndGet3 >= 0) {
                                    z = true;
                                }
                                np2.A("Less than 0 remaining futures", z);
                                if (decrementAndGet3 == 0) {
                                    ArrayList arrayList4 = pw3Var.B;
                                    if (arrayList4 != null) {
                                        qb0Var = pw3Var.Y;
                                        arrayList = new ArrayList(arrayList4);
                                    }
                                } else {
                                    return;
                                }
                            }
                        } catch (Error e2) {
                            pw3Var.Y.c(e2);
                            int decrementAndGet4 = atomicInteger.decrementAndGet();
                            if (decrementAndGet4 >= 0) {
                                z = true;
                            }
                            np2.A("Less than 0 remaining futures", z);
                            if (decrementAndGet4 == 0) {
                                ArrayList arrayList5 = pw3Var.B;
                                if (arrayList5 != null) {
                                    qb0Var = pw3Var.Y;
                                    arrayList = new ArrayList(arrayList5);
                                }
                            } else {
                                return;
                            }
                        } catch (RuntimeException e3) {
                            if (z2) {
                                pw3Var.Y.c(e3);
                            }
                            int decrementAndGet5 = atomicInteger.decrementAndGet();
                            if (decrementAndGet5 >= 0) {
                                z = true;
                            }
                            np2.A("Less than 0 remaining futures", z);
                            if (decrementAndGet5 == 0) {
                                ArrayList arrayList6 = pw3Var.B;
                                if (arrayList6 != null) {
                                    qb0Var = pw3Var.Y;
                                    arrayList = new ArrayList(arrayList6);
                                }
                            } else {
                                return;
                            }
                        }
                        if (decrementAndGet == 0) {
                            ArrayList arrayList7 = pw3Var.B;
                            if (arrayList7 != null) {
                                qb0Var = pw3Var.Y;
                                arrayList = new ArrayList(arrayList7);
                                qb0Var.a(arrayList);
                                return;
                            }
                            np2.A(null, gx3Var2.isDone());
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        int decrementAndGet6 = atomicInteger.decrementAndGet();
                        if (decrementAndGet6 >= 0) {
                            z = true;
                        }
                        np2.A("Less than 0 remaining futures", z);
                        if (decrementAndGet6 == 0) {
                            ArrayList arrayList8 = pw3Var.B;
                            if (arrayList8 != null) {
                                pw3Var.Y.a(new ArrayList(arrayList8));
                            } else {
                                np2.A(null, gx3Var2.isDone());
                            }
                        }
                        throw th;
                    }
                }
                np2.A("Future was done before all dependencies completed", z2);
                return;
        }
    }

    public is(TextView textView, Typeface typeface, int i) {
        this.L = textView;
        this.R = typeface;
        this.B = i;
    }

    public is(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.R = bottomSheetBehavior;
        this.L = view;
        this.B = i;
    }
}
