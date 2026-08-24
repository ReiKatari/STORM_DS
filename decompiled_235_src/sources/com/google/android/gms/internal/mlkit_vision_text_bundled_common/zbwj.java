package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwj {
    public static String zba(zbtc zbtcVar) {
        StringBuilder sb = new StringBuilder(zbtcVar.zbd());
        for (int i = 0; i < zbtcVar.zbd(); i++) {
            byte zba = zbtcVar.zba(i);
            if (zba != 34) {
                if (zba != 39) {
                    if (zba != 92) {
                        switch (zba) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (zba >= 32 && zba <= 126) {
                                    sb.append((char) zba);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((zba >>> 6) & 3) + 48));
                                    sb.append((char) (((zba >>> 3) & 7) + 48));
                                    sb.append((char) ((zba & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
