package defpackage;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: or6  reason: default package */
/* loaded from: classes.dex */
public abstract class or6 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final long b = a(0, 0);

    public static final long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final TextDirectionHeuristic b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            }
                            return TextDirectionHeuristics.LOCALE;
                        }
                        return TextDirectionHeuristics.ANYRTL_LTR;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        return TextDirectionHeuristics.LTR;
    }
}
