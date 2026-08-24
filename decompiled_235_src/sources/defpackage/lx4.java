package defpackage;

import android.os.Build;
import android.view.View;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lx4  reason: default package */
/* loaded from: classes.dex */
public final class lx4 implements tv2 {
    public final View a;

    public lx4(View view) {
        this.a = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0068, code lost:
        if (r9 != 17) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0079, code lost:
        if (r1 == 9) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i) {
        int i2;
        int i3 = 0;
        if (i == 16) {
            i2 = 16;
        } else if (i == 6) {
            i2 = 6;
        } else if (i == 13) {
            i2 = 13;
        } else {
            i2 = 23;
            if (i != 23) {
                i2 = 3;
                if (i != 3) {
                    if (i == 0) {
                        i2 = 0;
                    } else if (i == 17) {
                        i2 = 17;
                    } else if (i == 27) {
                        i2 = 27;
                    } else {
                        i2 = 26;
                        if (i != 26) {
                            if (i == 9) {
                                i2 = 9;
                            } else {
                                i2 = 22;
                                if (i != 22) {
                                    i2 = 21;
                                    if (i != 21) {
                                        if (i == 1) {
                                            i2 = 1;
                                        } else {
                                            i2 = -1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = ao7.a;
        if (i2 != -1) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 34) {
                switch (i2) {
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    case ConnectionResult.API_DISABLED /* 23 */:
                    case SubAllocator.N4 /* 26 */:
                        i2 = 6;
                        break;
                    case 22:
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    case 27:
                        i2 = 4;
                        break;
                    case 25:
                        i2 = 0;
                        break;
                }
            }
            if (i4 < 30) {
                if (i2 != 12) {
                    if (i2 != 13) {
                        if (i2 != 16) {
                        }
                    } else {
                        i3 = 6;
                    }
                    if (i4 < 27) {
                        if (i3 == 7) {
                            if (i3 == 8) {
                            }
                        }
                    }
                    if (i3 != -1) {
                        return;
                    }
                    this.a.performHapticFeedback(i3);
                    return;
                }
                i3 = 1;
                if (i4 < 27) {
                }
                if (i3 != -1) {
                }
            }
            i3 = i2;
            if (i4 < 27) {
            }
            if (i3 != -1) {
            }
        }
        i3 = -1;
        if (i3 != -1) {
        }
    }
}
