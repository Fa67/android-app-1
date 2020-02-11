package net.ivpn.client.ui.dialog;

import net.ivpn.client.R;

public enum Dialogs {
    LOGOUT(R.string.dialogs_log_out_title, R.string.dialogs_log_out_message,
            R.string.dialogs_log_out_positive_button, R.string.dialogs_log_out_negative_button),
    SESSION_TOO_MANY(R.string.dialogs_session_too_many_title, R.string.dialogs_session_too_many_message,
            R.string.dialogs_session_force_login, R.string.dialogs_cancel),
    EMAIL_FORMAT_ERROR(R.string.dialogs_address_error_title, R.string.dialogs_address_error_msg,
            -1, R.string.dialogs_ok),
    USERNAME_FORMAT_ERROR(R.string.dialogs_error, R.string.dialogs_username_error_msg, -1, R.string.dialogs_ok),
    PASSWORD_EMPTY(R.string.dialogs_error, R.string.dialogs_password_empty_msg, -1, R.string.dialogs_ok),
    TOO_MANY_ATTEMPTS_ERROR(R.string.dialogs_authentication_error, R.string.dialogs_too_many_attempts, -1, R.string.dialogs_ok),
    TOO_MANY_ATTEMPTS_REG_ERROR(R.string.dialogs_registration_error_title, R.string.dialogs_too_many_attempts, -1, R.string.dialogs_ok),
    CUSTOM_ERROR(R.string.dialogs_error, -1, -1, R.string.dialogs_ok),
    REGISTRATION_ERROR(R.string.dialogs_registration_error_title, R.string.dialogs_registration_error_msg,
            -1, R.string.dialogs_ok),
    REGISTRATION_DISABLED(R.string.dialogs_registration_error_title, R.string.dialogs_registration_error,
            R.string.dialogs_registration_continue, R.string.dialogs_cancel),
    AUTHENTICATION_ERROR(R.string.dialogs_authentication_error, R.string.dialogs_authentication_error_msg, -1, R.string.dialogs_ok),
    SERVER_ERROR(R.string.dialogs_error, R.string.dialogs_server_error, -1, R.string.dialogs_ok),
    NOT_FOUND_ERROR(R.string.dialogs_not_found_error, R.string.dialogs_please_contact_support, -1, R.string.dialogs_ok),
    FORBIDDEN_ERROR(R.string.dialogs_forbidden_error, R.string.dialogs_please_contact_support, -1, R.string.dialogs_ok),
    CONNECTION_ERROR(R.string.dialogs_connection_error_title, R.string.dialogs_no_internet, -1, R.string.dialogs_ok),
    TRY_RECONNECT(R.string.dialogs_empty, R.string.dialogs_cant_connect,
            R.string.dialogs_try_again, R.string.dialogs_cancel),
    ON_CONNECTION_AUTHENTICATION_ERROR(R.string.dialogs_authentication_error, R.string.dialogs_auth_error_msg,
            R.string.dialogs_log_out_positive_button, R.string.dialogs_cancel),
    INCOMPATIBLE_SERVERS(R.string.dialogs_error, R.string.dialogs_servers_error, -1, R.string.dialogs_ok),
    ACCOUNT_VERIFICATION_ERROR(R.string.dialogs_error, R.string.dialogs_authentication_error_msg,
            R.string.dialogs_log_out_positive_button, -1),
    SESSION_HAS_EXPIRED(R.string.dialogs_error, R.string.dialogs_session_has_expired,
            R.string.dialogs_log_out_positive_button, -1),
    REMOVE_EMAIL(R.string.dialogs_log_out_title, R.string.dialogs_remove_email_forever,
            R.string.dialogs_ok, R.string.dialogs_cancel),
    FIRMWARE_ERROR(R.string.dialogs_error, R.string.dialogs_firmware_error_msg, -1, R.string.dialogs_ok),
    NO_VPN_SETTINGS(R.string.dialogs_error, R.string.dialogs_no_vpn_settings, -1, R.string.dialogs_ok),
    ALWAYS_ON_VPN_NOT_SUPPORTED(R.string.dialogs_error, R.string.dialogs_setting_not_supported, -1, R.string.dialogs_ok),
    ASK_LOCATION_PERMISSION(R.string.dialogs_permission_title, R.string.dialogs_location_permission_message,
            R.string.dialogs_permission_action_settings, R.string.dialogs_permission_action_deny),
    LOCATION_PERMISSION_INFO(R.string.dialogs_permission_title, R.string.dialogs_location_permission_info_message, -1, R.string.dialogs_ok),
    WG_DELETE_KEY_ERROR(R.string.dialogs_failed_remove_key_title, R.string.protocol_wg_deleting_key_error, -1, R.string.dialogs_ok),
    WG_UPLOADING_KEY_ERROR(R.string.dialogs_failed_create_key_title, R.string.protocol_wg_uploading_key_error, -1, R.string.dialogs_ok),
    WG_MAXIMUM_KEYS_REACHED(R.string.dialogs_failed_create_key_title, R.string.protocol_wg_uploading_too_many_keys, -1, R.string.dialogs_ok),
    WG_UPGRADE_ERROR(R.string.dialogs_failed_upgrade_title, R.string.dialogs_failed_upgrade_message, -1, R.string.dialogs_ok);

    private int titleId;
    private int messageId;
    private int positiveBtnId;
    private int negativeBtnId;

    Dialogs(int titleId, int messageId, int positiveBtnId, int negativeBtnId) {
        this.titleId = titleId;
        this.messageId = messageId;
        this.positiveBtnId = positiveBtnId;
        this.negativeBtnId = negativeBtnId;
    }

    public int getTitleId() {
        return titleId;
    }

    public int getMessageId() {
        return messageId;
    }

    public int getPositiveBtnId() {
        return positiveBtnId;
    }

    public int getNegativeBtnId() {
        return negativeBtnId;
    }
}