package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbaab implements zbuj {
    static final zbuj zba = new zbaab();

    private zbaab() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj
    public final boolean zba(int i) {
        if (i == 3000 || i == 4000 || i == 5000 || i == 6000 || i == 6001 || i == 7000 || i == 7001) {
            return true;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i) {
                    case 20:
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    case 22:
                    case ConnectionResult.API_DISABLED /* 23 */:
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    case 25:
                    case SubAllocator.N4 /* 26 */:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        return true;
                    default:
                        switch (i) {
                            case 40:
                            case 41:
                            case 42:
                                return true;
                            default:
                                switch (i) {
                                    case 1000:
                                    case 1001:
                                    case 1002:
                                    case 1003:
                                    case 1004:
                                    case 1005:
                                    case 1006:
                                    case 1007:
                                    case 1008:
                                    case 1009:
                                    case 1010:
                                    case 1011:
                                    case 1012:
                                    case 1013:
                                    case 1014:
                                    case 1015:
                                    case 1016:
                                        return true;
                                    default:
                                        switch (i) {
                                            case 2000:
                                            case 2001:
                                            case 2002:
                                            case 2003:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }
}
