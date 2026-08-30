package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vr  reason: default package */
/* loaded from: classes.dex */
public final class vr implements Runnable {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public vr(np3 np3Var, int i, fq3 fq3Var) {
        this.R = np3Var;
        this.B = i;
        this.L = fq3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i90 i90Var;
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
                ((BottomSheetBehavior) obj2).E((View) obj, i2, false);
                return;
            default:
                np3 np3Var = (np3) obj2;
                fq3 fq3Var = (fq3) obj;
                boolean z2 = np3Var.L;
                AtomicInteger atomicInteger = np3Var.R;
                ArrayList arrayList2 = np3Var.B;
                fq3 fq3Var2 = np3Var.X;
                if (!fq3Var2.isDone() && arrayList2 != null) {
                    try {
                        try {
                            try {
                                try {
                                    nl2.D("Tried to set value from future which is not done", fq3Var.isDone());
                                    arrayList2.set(i2, jv3.I(fq3Var));
                                    decrementAndGet = atomicInteger.decrementAndGet();
                                    if (decrementAndGet >= 0) {
                                        z = true;
                                    }
                                    nl2.D("Less than 0 remaining futures", z);
                                } catch (CancellationException unused) {
                                    if (z2) {
                                        np3Var.cancel(false);
                                    }
                                    int decrementAndGet2 = atomicInteger.decrementAndGet();
                                    if (decrementAndGet2 >= 0) {
                                        z = true;
                                    }
                                    nl2.D("Less than 0 remaining futures", z);
                                    if (decrementAndGet2 == 0) {
                                        ArrayList arrayList3 = np3Var.B;
                                        if (arrayList3 != null) {
                                            i90Var = np3Var.Y;
                                            arrayList = new ArrayList(arrayList3);
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            } catch (ExecutionException e) {
                                if (z2) {
                                    np3Var.Y.c(e.getCause());
                                }
                                int decrementAndGet3 = atomicInteger.decrementAndGet();
                                if (decrementAndGet3 >= 0) {
                                    z = true;
                                }
                                nl2.D("Less than 0 remaining futures", z);
                                if (decrementAndGet3 == 0) {
                                    ArrayList arrayList4 = np3Var.B;
                                    if (arrayList4 != null) {
                                        i90Var = np3Var.Y;
                                        arrayList = new ArrayList(arrayList4);
                                    }
                                } else {
                                    return;
                                }
                            }
                        } catch (Error e2) {
                            np3Var.Y.c(e2);
                            int decrementAndGet4 = atomicInteger.decrementAndGet();
                            if (decrementAndGet4 >= 0) {
                                z = true;
                            }
                            nl2.D("Less than 0 remaining futures", z);
                            if (decrementAndGet4 == 0) {
                                ArrayList arrayList5 = np3Var.B;
                                if (arrayList5 != null) {
                                    i90Var = np3Var.Y;
                                    arrayList = new ArrayList(arrayList5);
                                }
                            } else {
                                return;
                            }
                        } catch (RuntimeException e3) {
                            if (z2) {
                                np3Var.Y.c(e3);
                            }
                            int decrementAndGet5 = atomicInteger.decrementAndGet();
                            if (decrementAndGet5 >= 0) {
                                z = true;
                            }
                            nl2.D("Less than 0 remaining futures", z);
                            if (decrementAndGet5 == 0) {
                                ArrayList arrayList6 = np3Var.B;
                                if (arrayList6 != null) {
                                    i90Var = np3Var.Y;
                                    arrayList = new ArrayList(arrayList6);
                                }
                            } else {
                                return;
                            }
                        }
                        if (decrementAndGet == 0) {
                            ArrayList arrayList7 = np3Var.B;
                            if (arrayList7 != null) {
                                i90Var = np3Var.Y;
                                arrayList = new ArrayList(arrayList7);
                                i90Var.a(arrayList);
                                return;
                            }
                            nl2.D(null, fq3Var2.isDone());
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        int decrementAndGet6 = atomicInteger.decrementAndGet();
                        if (decrementAndGet6 >= 0) {
                            z = true;
                        }
                        nl2.D("Less than 0 remaining futures", z);
                        if (decrementAndGet6 == 0) {
                            ArrayList arrayList8 = np3Var.B;
                            if (arrayList8 != null) {
                                np3Var.Y.a(new ArrayList(arrayList8));
                            } else {
                                nl2.D(null, fq3Var2.isDone());
                            }
                        }
                        throw th;
                    }
                }
                nl2.D("Future was done before all dependencies completed", z2);
                return;
        }
    }

    public vr(TextView textView, Typeface typeface, int i) {
        this.L = textView;
        this.R = typeface;
        this.B = i;
    }

    public vr(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.R = bottomSheetBehavior;
        this.L = view;
        this.B = i;
    }
}
